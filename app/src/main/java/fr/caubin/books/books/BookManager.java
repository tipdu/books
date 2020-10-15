package fr.caubin.books.books;


import android.app.Application;
import android.content.Context;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONException;
import org.json.JSONObject;

import fr.caubin.books.utils.NetworkManager;

/**
 * Connect to the book API
 */
public class BookManager {
    Context applicationContext;
    // TODO : set "https://openlibrary.org" to be a project constant
    String bookAPIUrl = "https://openlibrary.org"  ;
    RequestQueue requestQueue;

    private static final String TAG = "BookManager";

    public BookManager(Context applicationContext) {
        this.applicationContext = applicationContext;
        requestQueue = NetworkManager.getInstance(applicationContext).getRequestQueue();
    }

    public void getBookFromISBN(String isbn)
    {
        String bookURL = String.format("%s/isbn/%s.json", bookAPIUrl, isbn);

        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest
                (Request.Method.GET, bookURL, null, new Response.Listener<JSONObject>()
                {
                    @Override
                    public void onResponse(JSONObject response) {
                        buildBook(response);
                    }

                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        //TODO : handle the error
                        String message = error.getMessage();
                    }
                });
        NetworkManager.getInstance(applicationContext).addToQueueRequest(jsonObjectRequest);

    }

    public Book buildBook(JSONObject bookObject)
    {
        // TODO : finish the book creation
        Book book = new Book();

        Log.d(TAG, "Building book ...");

        try {
            book.setTitle(bookObject.getString("title"));
        } catch (JSONException e) {

        }

        return book;
    }
}
