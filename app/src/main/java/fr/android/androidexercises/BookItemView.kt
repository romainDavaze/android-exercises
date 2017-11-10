package fr.android.androidexercises

import android.content.Context
import android.util.AttributeSet
import android.widget.TextView
import android.widget.LinearLayout



/**
 * Created by romain on 11/10/17.
 */
class BookItemView @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : LinearLayout(context, attrs, defStyleAttr) {

    private var nameTextView: TextView? = null
    private var priceTextView: TextView? = null

    override fun onFinishInflate() {
        super.onFinishInflate()
        this.nameTextView = findViewById(R.id.nameTextView)
        this.priceTextView = findViewById(R.id.priceTextView)
    }

    fun bindView(book: Book) {
        this.nameTextView!!.text = book.name
        this.priceTextView!!.text = book.price.toString()
    }
}