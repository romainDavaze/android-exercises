package fr.android.androidexercises;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by romain on 11/9/17.
 */

class BookAdapter2 extends RecyclerView.Adapter<BookAdapter2.MyViewHolder> {

    private final List<Book> books;
    private final LayoutInflater inflater;

    public BookAdapter2(LayoutInflater from, List<Book> books) {
        this.books = books;
        this.inflater = from;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new MyViewHolder(this.inflater.inflate(R.layout.custom_view_item_book, parent, false));
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        ((BookItemView)holder.itemView).bindView(books.get(position));
    }

    @Override
    public int getItemCount() {
        return books.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        public MyViewHolder(View itemView) {
            super(itemView);
        }
    }
}
