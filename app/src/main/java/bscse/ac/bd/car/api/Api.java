package bscse.ac.bd.car.api;

import android.app.Service;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Api {

    public static CarService carService() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://10.0.2.2/caro/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        CarService service = retrofit.create(CarService.class);

        return service;
    }
}
