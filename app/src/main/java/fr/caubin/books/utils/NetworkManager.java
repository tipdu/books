package fr.caubin.books.utils;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;


/**
 * Singleton that contains the network queue
 */
public class NetworkManager {
    private static NetworkManager instance;
    private RequestQueue requestQueue;
    private static Context ctx;

    private NetworkManager(Context context){
        ctx = context;
        requestQueue = getRequestQueue();
    }

    public static synchronized NetworkManager getInstance(Context context){
        if(instance == null){
            instance = new NetworkManager(context);
        }
        return instance;
    }

    public RequestQueue getRequestQueue(){
        if(requestQueue == null){
            requestQueue = Volley.newRequestQueue(ctx.getApplicationContext());
        }
        return requestQueue;
    }

    public <T> void addToQueueRequest(Request<T> req) {
        getRequestQueue().add(req);
    }
}
