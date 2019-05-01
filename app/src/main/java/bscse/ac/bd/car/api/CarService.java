package bscse.ac.bd.car.api;

import java.util.List;

import bscse.ac.bd.car.Dummy;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface CarService {
    @GET("comments?")
    Call<List<Dummy>> listRepos(@Query("postId") int postId);
}
