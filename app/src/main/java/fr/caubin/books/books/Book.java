package fr.caubin.books.books;

import java.net.URL;
import java.util.List;

import fr.caubin.books.author.Author;

/**
 * Define the Book structure
 */
public class Book {

    // TODO : add missing pieces of information
    String       title;
    List<Author> author;
    String       resume;
    URL          coverImage;
    List<String> genreList;

    public Book() {

    }

    public Book(String title, List<Author> author, String resume, URL coverImage, List<String> genreList) {
        this.title = title;
        this.author = author;
        this.resume = resume;
        this.coverImage = coverImage;
        this.genreList = genreList;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Author> getAuthor() {
        return author;
    }

    public void setAuthor(List<Author> author) {
        this.author = author;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public URL getCoverImage() {
        return coverImage;
    }

    public void setCoverImage(URL coverImage) {
        this.coverImage = coverImage;
    }

    public List<String> getGenreList() {
        return genreList;
    }

    public void setGenreList(List<String> genreList) {
        this.genreList = genreList;
    }
}
