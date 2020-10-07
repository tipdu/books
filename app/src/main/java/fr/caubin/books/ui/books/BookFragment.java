package fr.caubin.books.ui.books;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import fr.caubin.books.R;

public class BookFragment extends Fragment {

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_book, container, false);
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // If there are some information to be displayed in the fragment, initialize them here
        if (savedInstanceState != null) {
            if (savedInstanceState.get("author") != null) {
                ((TextView) view.findViewById(R.id.authorTextView)).setText(
                        (String) savedInstanceState.get("author")
                );
            }

            if (savedInstanceState.get("title") != null) {
                ((TextView) view.findViewById(R.id.titleTextView)).setText(
                        (String) savedInstanceState.get("title")
                );
            }
        } else {
            ((TextView) view.findViewById(R.id.authorTextView)).setText("TOTO");
        }
    }
}