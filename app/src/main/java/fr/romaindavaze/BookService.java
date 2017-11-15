package fr.romaindavaze;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * @author romain
 */

public interface BookService {

    @GET("books")
    Call<List<Book>> getBooks();
}
