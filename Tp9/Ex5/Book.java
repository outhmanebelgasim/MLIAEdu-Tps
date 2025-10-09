package Tp9.Ex5;

import java.util.Objects;

public class Book {
	private String isbn;
    private String title;
    private String author;

    public Book(String isbn, String title, String author) {
        this.isbn = isbn; 
        this.title = title; 
        this.author = author;
    }

    public String getIsbn()  { return isbn; }
    public String getTitle() { return title; }
    public String getAuthor(){ return author; }
    
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        return isbn.equals(((Book)o).isbn);
    }
    
    public int hashCode() {
        return Objects.hash(isbn);
    }
    
    public String toString() {
        return String.format("%s (ISBN:%s) by %s", title, isbn, author);
    }
}
