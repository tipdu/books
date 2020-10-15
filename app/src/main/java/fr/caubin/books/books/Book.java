package fr.caubin.books.books;

import org.apache.commons.lang3.StringUtils;

import java.net.URL;
import java.util.Collections;
import java.util.List;

import fr.caubin.books.author.Author;
import fr.caubin.books.images.Image;

/**
 * Define the Book structure
 */
public class Book {

    // TODO : add missing pieces of information
    String       title = StringUtils.EMPTY;
    List<Author> authors = Collections.EMPTY_LIST;
    String       resume = StringUtils.EMPTY;
    Image        coverImage = null;
    List<String> genreList = Collections.EMPTY_LIST;

    public Book() {

    }

    public Book(String title, List<Author> authors, String resume, Image coverImage, List<String> genreList) {
        this.title = title;
        this.authors = authors;
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

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public Image getCoverImage() {
        return coverImage;
    }

    public void setCoverImage(Image coverImage) {
        this.coverImage = coverImage;
    }

    public List<String> getGenreList() {
        return genreList;
    }

    public void setGenreList(List<String> genreList) {
        this.genreList = genreList;
    }
}
