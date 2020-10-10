package fr.caubin.books.author;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONObject;

import fr.caubin.books.author.Author;
import fr.caubin.books.utils.NetworkManager;

public class AuthorManager {
    Context applicationContext;
    // TODO : set "https://openlibrary.org" to be a project constant
    String basicUrl = "https://openlibrary.org";
    RequestQueue requestQueue;

    public AuthorManager(Context applicationContext) {
        this.applicationContext = applicationContext;
        requestQueue = NetworkManager.getInstance(applicationContext).getRequestQueue();
    }

    public void getAuthorFromURL(String url)
    {
        String authorURL = basicUrl + url;
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest
                (Request.Method.GET,authorURL,null,new Response.Listener<JSONObject>()
                {
                    @Override
                    public void onResponse(JSONObject response) {
                        returnAuthor(response);
                    }
                }, new Response.ErrorListener(){
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        //TODO Handle the error
                        String message = error.getMessage();
                    }
                });
        NetworkManager.getInstance(applicationContext).addToQueueRequest(jsonObjectRequest);

    }

    public Author returnAuthor(JSONObject authorObject)
    {
        //TODO : finish the author creation
        Author author = new Author();

        return author;
    }
}
