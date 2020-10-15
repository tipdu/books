package fr.caubin.books;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import fr.caubin.books.ui.main.MainFragment;

public class MainActivity extends AppCompatActivity {

    private MainManager mainManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Get the main manager
        mainManager = MainManager.initialize(this.getApplicationContext());

        setContentView(R.layout.main_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, MainFragment.newInstance())
                    .commitNow();
        }
    }
}