package fr.android.androidexercises

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


/**
 * Created by romain on 11/10/17.
 */
internal class BookAdapter2(private val inflater: LayoutInflater, private val books: List<Book>) : RecyclerView.Adapter<BookAdapter2.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(this.inflater.inflate(R.layout.custom_view_item_book, parent, false))
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        (holder.itemView as BookItemView).bindView(books[position])
    }

    override fun getItemCount(): Int {
        return books.size
    }

    internal inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}