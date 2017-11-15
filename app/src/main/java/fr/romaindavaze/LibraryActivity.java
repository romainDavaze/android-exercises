package fr.romaindavaze;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import timber.log.Timber;

public class LibraryActivity extends AppCompatActivity implements BookFragment.OnBookClickedListener {

    private Book selectedBook;
    private boolean isLandscape;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Timber.plant(new Timber.DebugTree());

        isLandscape = getResources().getBoolean(R.bool.isLandscape);

        BookFragment bookFragment = null;

        if(savedInstanceState != null){
            selectedBook = savedInstanceState.getParcelable("book");
            // TODO : DISPLAY DEPENDING ON ORIENTATION
        } else {
            bookFragment = new BookFragment();
        }


        getSupportFragmentManager().beginTransaction()
                .replace(R.id.containerFrameLayout, bookFragment, BookFragment.class.getSimpleName())
                .commit();
    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putParcelable("book", selectedBook);
    }


    @Override
    public void onBookClicked(Book book) {
        selectedBook = book;
        // TODO: DISPLAY DEPENDING ON ORIENTATION
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_library, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
