package fr.romaindavaze;

import android.os.Parcel;
import android.os.Parcelable;

class Book implements Parcelable{

    private String title;
    private String price;
    private String cover;
    private String isbn;
    private String[] synopsis;


    private Book(Parcel in) {
        title = in.readString();
        price = in.readString();
        cover = in.readString();
        isbn = in.readString();
        synopsis = in.createStringArray();
    }

    public static final Creator<Book> CREATOR = new Creator<Book>() {
        @Override
        public Book createFromParcel(Parcel in) {
            return new Book(in);
        }

        @Override
        public Book[] newArray(int size) {
            return new Book[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(title);
        dest.writeString(price);
        dest.writeString(cover);
        dest.writeString(isbn);
        dest.writeStringArray(synopsis);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    String[] getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String[] synopsis) {
        this.synopsis = synopsis;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        return isbn.equals(book.isbn);
    }

    @Override
    public int hashCode() {
        return isbn.hashCode();
    }
}