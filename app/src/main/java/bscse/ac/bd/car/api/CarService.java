package bscse.ac.bd.car.api;

import java.util.List;

import bscse.ac.bd.car.Dummy;
import bscse.ac.bd.car.SearchVehicle;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface CarService {
    @GET("vehicle.php")
    Call<List<SearchVehicle>> listCars();
}
