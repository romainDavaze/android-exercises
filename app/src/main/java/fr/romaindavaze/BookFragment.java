package fr.romaindavaze;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * @author romain
 */

public class BookFragment extends Fragment {

    private ArrayList<Book> books = new ArrayList<>();
    private BookAdapter bookAdapter;
    private OnBookClickedListener listener;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        listener = (OnBookClickedListener) context;
    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.book_fragment, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        // TODO : SETUP RECYCLER VIEW
        // TODO : RETRIEVE BOOKS

    }


    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putParcelableArrayList("books", books);
    }

    public interface OnBookClickedListener {
        void onBookClicked(Book book);
    }
}
