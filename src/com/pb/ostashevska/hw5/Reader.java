package com.pb.ostashevska.hw5;

public class Reader {
    private String fullName;
    private  int libraryCardNumber;
    private  String faculty;
    private  String dateOfBirth;
    private double phoneNumber;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getLibraryCardNumber() {
        return libraryCardNumber;
    }

    public void setLibraryCardNumber(int libraryCardNumber) {
        this.libraryCardNumber = libraryCardNumber;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public double getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(double phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void takeBook(String fullName, int i) {
        if (fullName != null) {
            if (i > 0) {
                System.out.println(fullName + " взяв " + i + " книги");
            } else {
                System.out.println(fullName + " не взяв жодної книги");
            }
        } else {
            System.out.println("Читача не знайдено");
        }
    }

    public void takeBook(String fullName, String... bookTitles) {
        if (fullName != null) {
            if (bookTitles != null) {
                System.out.println(fullName + " взяв книги: ");
                for (String bookTitle : bookTitles) {
                    System.out.println(bookTitle);
                }
            } else {
                System.out.println(fullName + " не взяв жодної книги");
            }
        } else {
            System.out.println("Читача не знайдено");
        }
    }

    static Book takeBook(String fullName, Book... book) {
        if (fullName != null) {
            System.out.println(fullName + " взяв книги: ");
            for (int j = 0; j < book.length; j++) {
                System.out.println(book[j]);
            }
        } else {
            System.out.println(fullName + " не взяв жодної книги");
        }
        return null;
    }

    public void returnBook(String fullName, int i) {
        if (fullName != null) {
            if (i > 0) {
                System.out.println(fullName + " повернув " + i + " книги");
            } else {
                System.out.println(fullName + " не повернув жодної книги");
            }
        } else {
            System.out.println("Читача не знайдено");
        }
    }

    public void returnBook(String fullName, String... bookTitles) {
        if (fullName != null) {
            if (bookTitles != null) {
                System.out.println(fullName + " повернув книги: ");
                for (String bookTitle : bookTitles) {
                    System.out.println(bookTitle);
                }
            } else {
                System.out.println(fullName + " не повернув жодної книги");
            }
        } else {
            System.out.println("Читача не знайдено");
        }
    }

    static Book returnBook(String fullName, Book... book) {
        if (fullName != null) {
            System.out.println(fullName + " повернув книги: ");
            for (int j = 0; j < book.length; j++) {
                System.out.println(book[j]);
            }
        } else {
            System.out.println(fullName + " не повернув жодної книги");
        }
        return null;
    }
}
