package fr.romaindavaze;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;

/**
 * @author romain
 */

public class BookItemView extends LinearLayout {

    private TextView nameTextView;
    private TextView priceTextView;
    private ImageView coverImageView;

    public BookItemView(Context context) {
        super(context);
    }

    public BookItemView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public BookItemView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();

        nameTextView = findViewById(R.id.nameTextView);
        priceTextView = findViewById(R.id.priceTextView);
        coverImageView = findViewById(R.id.coverImageView);
    }


    public void bindView(Book book){
        nameTextView.setText(book.getName());
        priceTextView.setText(String.format("%s €", book.getPrice()));

        Glide.with(this)
                .load(book.getCover())
                .into(coverImageView);

    }
}
