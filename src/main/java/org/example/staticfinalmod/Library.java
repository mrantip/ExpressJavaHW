package org.example.staticfinalmod;

public class Library {

    private String bookTitle;
    protected String author;
    int year;
    public String category;

    public String getBookTitle() {
        return this.bookTitle;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getYear() {
        return this.year;
    }

    public String getCategory() {
        return this.category;
    }

    public void setBookTitle(String newBookTitle) {
        this.bookTitle = newBookTitle;
    }

    public void setAuthor(String newAuthor) {
        this.author = newAuthor;
    }

    public void setYear(int newYear) {
        this.year = newYear;
    }

    public void setCategory(String newCategory) {
        this.category = newCategory;
    }
}
