package fr.caubin.books.books;


import android.app.Application;
import android.content.Context;

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
public class BookManager{
    Context applicationContext;
    // TODO : set "https://openlibrary.org" to be a project constant
    String bookAPIUrl = "https://openlibrary.org" + "/books/" ;
    RequestQueue requestQueue;

    public BookManager(Context applicationContext) {
        this.applicationContext = applicationContext;
        requestQueue = NetworkManager.getInstance(applicationContext).getRequestQueue();
    }

    public void getBookFromISBN(String isbn)
    {
        Book book = new Book();
        String  bookUrl = bookAPIUrl + isbn + ".json";

        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest
                (Request.Method.GET, bookUrl, null, new Response.Listener<JSONObject>()
                {
                    @Override
                    public void onResponse(JSONObject response) {
                        Book book = new Book();
                        try {
                            //TODO : use complementary manager to set authors
                            book.setAuthor(response.getString("authors"));

                            book.setTitle(response.getString("title"));
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }

                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        //TODO : handle the error
                        Book book = new Book();
                        String test = error.getMessage();
                    }
                });
        NetworkManager.getInstance(applicationContext).addToQueueRequest(jsonObjectRequest);



    }
}
