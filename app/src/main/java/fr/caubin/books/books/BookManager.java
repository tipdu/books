package fr.caubin.books.books;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Connect to the book API
 */
public class BookManager {
    URL bookAPIUrl;

    public Book getBookFromISBN(String isbn) throws MalformedURLException {
        Book book = new Book();
        bookAPIUrl = new URL("https://openlibrary.org/books/" + isbn);

        return book;
    }
}
