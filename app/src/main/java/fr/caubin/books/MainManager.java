package fr.caubin.books;

import android.content.Context;

public class MainManager {

    private static MainManager singleton;

    public static MainManager initialize(Context context) {
        if (MainManager.singleton == null) {
            MainManager.singleton = new MainManager(context);
        }

        return MainManager.singleton;
    }

    public static MainManager get() {
        return MainManager.singleton;
    }

    public MainManager(Context context) {
        // Create the other managers
    }
}
