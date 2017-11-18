package fr.romaindavaze.service;

import java.util.List;

import fr.romaindavaze.model.Book;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * @author romain
 */

public interface BookService {

    @GET("books")
    Call<List<Book>> getBooks();
}
