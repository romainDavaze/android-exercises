package fr.android.androidexercises

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import android.view.LayoutInflater
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.activity_library.*
import java.util.*


class LibraryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_library)

        val books = getBooks()

        val isLandscape = resources.getBoolean(R.bool.landscape)

        bookListView.layoutManager = GridLayoutManager(this, if (isLandscape) 2 else 1)
        bookListView.adapter = BookAdapter2(LayoutInflater.from(this), books)

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_library, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        val id = item.itemId

        return if (id == R.id.action_settings) true else super.onOptionsItemSelected(item)
    }

    private fun getBooks(): List<Book> {
        val books = ArrayList<Book>()
        val random = Random()
        for (i in 0..99) {
            books.add(Book(
                    String.format(Locale.FRANCE, "Garry Potier Tome %d", i),
                    random.nextInt(30).toFloat())
            )
        }
        return books
    }
}
