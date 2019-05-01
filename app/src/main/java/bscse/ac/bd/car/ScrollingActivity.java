package bscse.ac.bd.car;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

import java.util.List;

import bscse.ac.bd.car.api.Api;
import bscse.ac.bd.car.api.CarService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ScrollingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        CarService carService = Api.carService();
        Call<List<Dummy>> repos = carService.listRepos(1);
        repos.enqueue(new Callback<List<Dummy>>() {
            @Override
            public void onResponse(Call<List<Dummy>> call, Response<List<Dummy>> response) {
                int i = 0;
            }

            @Override
            public void onFailure(Call<List<Dummy>> call, Throwable t) {

            }
        });

    }
}
