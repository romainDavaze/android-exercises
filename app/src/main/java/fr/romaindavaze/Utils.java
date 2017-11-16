package fr.romaindavaze;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * @author romain
 */

class Utils {

    private static final String URL = "http://henri-potier.xebia.fr/";

    static final String BOOK_KEY = "BOOK";
    static final String BOOKS_KEY = "BOOKS";

    static Retrofit buildRetrofit(){
        return new Retrofit.Builder()
                .baseUrl(URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

}
