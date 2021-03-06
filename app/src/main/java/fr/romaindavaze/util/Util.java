package fr.romaindavaze.util;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * @author romain
 */

public class Util {

    private static final String URL = "http://henri-potier.xebia.fr/";

    public static final String BOOK_KEY = "BOOK";
    public static final String BOOKS_KEY = "BOOKS";

    public static Retrofit buildRetrofit(){
        return new Retrofit.Builder()
                .baseUrl(URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

}
