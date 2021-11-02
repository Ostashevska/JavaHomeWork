package com.pb.ostashevska.hw5;
import java.util.Arrays;
public class Library {
    public static void main(String[] args) {
        Book book = new Book("Володар Перстнів ", "Дж. Р.Р. Толкін", 2002);
        Book book1 = new Book("Хоббіт, або туди і назад", "Дж. Р.Р. Толкін", 1985);
        Book book2 = new Book("Сильмариліон", "Дж. Р.Р. Толкін", 2008);

        Reader reader= new Reader();
        Reader reader1= new Reader();
        Reader reader2= new Reader();

        reader.setFullName("Ряба І.В. ");
        reader.setDateOfBirth("30-05-1994 ");
        reader.setFaculty("Лікувальна справа ");
        reader.setLibraryCardNumber(53655553);
        reader.setPhoneNumber(380695642);

        reader1.setFullName("Соловйова Т.В. ");
        reader1.setDateOfBirth("27-06-1996 ");
        reader1.setFaculty("Фінанси та кредит ");
        reader1.setLibraryCardNumber(123456789);
        reader1.setPhoneNumber(380999555);

        reader2.setFullName("Оліярник Т.А. ");
        reader2.setDateOfBirth("05-05-1993 ");
        reader2.setFaculty("Прикладна лінгвістика ");
        reader2.setLibraryCardNumber(63522232);
        reader2.setPhoneNumber(526655622);

        System.out.println (book.getBookTitle()+book.getBookAuthor()+book.getYearOfPublishing());
        System.out.println (book1.getBookTitle()+book1.getBookAuthor()+book1.getYearOfPublishing());
        System.out.println (book2.getBookTitle()+book2.getBookAuthor()+book2.getYearOfPublishing());

        System.out.println (reader.getFullName()+reader.getDateOfBirth()+reader.getFaculty()+" "+reader.getLibraryCardNumber()+" "+reader.getPhoneNumber());
        System.out.println (reader1.getFullName()+reader1.getDateOfBirth()+reader1.getFaculty()+" "+reader1.getLibraryCardNumber()+" "+reader1.getPhoneNumber());
        System.out.println (reader2.getFullName()+reader2.getDateOfBirth()+reader2.getFaculty()+" "+reader2.getLibraryCardNumber()+" "+reader2.getPhoneNumber());


        reader.takeBook("Літинська М.В.",3);
        reader.takeBook("Літинська М.В.","Володар Перстнів", "Хоббіт, або туди і назад ", "Сильмариліон");
        reader.takeBook("Літинська М.В.",book, book1);

        reader.returnBook("Осташевська Н.С.", 2);
        reader.returnBook("Осташевська Н.С.","Володар Перстнів", "Хоббіт, або туди і назад ");
        reader.returnBook("Осташевська Н.С.",book, book1, book2);


    }
}
