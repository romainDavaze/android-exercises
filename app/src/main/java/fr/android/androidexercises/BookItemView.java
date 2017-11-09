package fr.android.androidexercises;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class BookItemView extends LinearLayout {

    private TextView nameTextView;
    private TextView priceTextView;

    public BookItemView(Context context) {
        this(context, null);
    }

    public BookItemView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public BookItemView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.nameTextView = findViewById(R.id.nameTextView);
        this.priceTextView = findViewById(R.id.priceTextView);
    }

    public void bindView(Book book) {
        this.nameTextView.setText(book.name);
        this.priceTextView.setText(String.valueOf(book.price));
    }
}
