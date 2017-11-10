package fr.android.androidexercises

import android.content.Context
import android.util.AttributeSet
import android.widget.TextView
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.custom_view_item_book.view.*


/**
 * Created by romain on 11/10/17.
 */
class BookItemView @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0) : LinearLayout(context, attrs, defStyleAttr) {

    private var nametV: TextView? = null
    private var pricetV: TextView? = null

    override fun onFinishInflate() {
        super.onFinishInflate()
        this.nametV = nameTextView
        this.pricetV = priceTextView
    }

    fun bindView(book: Book) {
        this.nametV!!.text = book.name
        this.pricetV!!.text = book.price.toString()
    }
}