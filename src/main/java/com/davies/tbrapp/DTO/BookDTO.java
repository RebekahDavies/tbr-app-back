package com.davies.tbrapp.DTO;
import javax.xml.bind.annotation.*;
import java.util.Date;

public class BookDTO {
    String isbn;
    String title;
    String author;
    String description;
    Date publicationDate;
    Float averageRating;

    public BookDTO(String isbn, String title, String author, String description, Date publicationDate, Float averageRating) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.description = description;
        this.publicationDate = publicationDate;
        this.averageRating = averageRating;
    }

    public BookDTO(String isbn, String title, String author, String description, Float averageRating) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.description = description;
        this.averageRating = averageRating;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    public Float getAverageRating() {
        return averageRating;
    }

    public void setAverageRating(Float averageRating) {
        this.averageRating = averageRating;
    }
}
