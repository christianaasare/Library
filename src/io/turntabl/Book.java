package io.turntabl;

public class Book {
    private String title;
    private int ISBN;
    private BookCategory category;
    private String author;
    private BookState state;



    public Book(String title, int ISBN, String author,BookCategory category, BookState state) {
        this.title = title;
        this.ISBN = ISBN;
        this.category = category;
        this.author = author;
        this.state=state;

    }

    public BookCategory getCategory() {
        return category;
    }

    public void setCategory(BookCategory category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public int getISBN() {
        return ISBN;
    }

    public String getAuthor() {
        return author;
    }

    public BookState getState() {
        return state;
    }
}