package com.pb.ostashevska.hw5;
import java.util.Scanner;

public class Book {

    private   String bookTitle;
    private   String bookAuthor;
    private  int yearOfPublishing;

    public Book (){
        if (bookTitle!= null){
            this.bookTitle= bookTitle;
        }
        if (bookAuthor!= null){
            this.bookAuthor= bookAuthor;
        }
        if (yearOfPublishing!= 0){
            this.yearOfPublishing= yearOfPublishing;
        }
    }
    public Book (String bookTitle, String bookAuthor, int yearOfPublishing){
        if (bookTitle!= null){
            this.bookTitle= bookTitle;
        }
        if (bookAuthor!= null){
            this.bookAuthor= bookAuthor;
        }
        if (yearOfPublishing!= 0){
            this.yearOfPublishing= yearOfPublishing;
        }
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

}
