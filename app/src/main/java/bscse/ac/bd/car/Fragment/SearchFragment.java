package bscse.ac.bd.car.Fragment;


import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import bscse.ac.bd.car.Adapter.SearchAdapter;
import bscse.ac.bd.car.BookingActivity;
import bscse.ac.bd.car.R;
import bscse.ac.bd.car.SearchVehicle;
import bscse.ac.bd.car.api.Api;
import bscse.ac.bd.car.api.CarService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * A simple {@link Fragment} subclass.
 */
public class SearchFragment extends Fragment implements SearchAdapter.OnItemClickListener {

    RecyclerView recyclerView;

    public SearchFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_search, container, false);
        recyclerView =  v.findViewById(R.id.searchRecylerView);
        List<SearchVehicle> vehicles = new ArrayList<>();
        //vehicles.add(new SearchVehicle("Honda", "Accord", "119","17 trips","2018"));
       //vehicles.add(new SearchVehicle("Honda", "Type-R", "119","17 trips","2018"));


        return v;
    }


    @Override
    public void onItemClick(SearchVehicle vehicle) {
        Intent intent = new Intent(getActivity(), BookingActivity.class);
        intent.putExtra("vehicle", vehicle);
        startActivity(intent);
    }

    @Override
    public void onResume() {
        super.onResume();
        Objects.requireNonNull(getActivity()).setTitle("Caro");

                CarService carService = Api.carService();
        Call<List<SearchVehicle>> repos = carService.listCars();
        repos.enqueue(new Callback<List<SearchVehicle>>() {
            @Override
            public void onResponse(Call<List<SearchVehicle>> call, Response<List<SearchVehicle>> response) {
                initList(response.body());
            }

            @Override
            public void onFailure(Call<List<SearchVehicle>> call, Throwable t) {

            }
        });
    }

    private void initList(List<SearchVehicle> searchVehicles) {
        SearchAdapter searchAdapter = new SearchAdapter(searchVehicles, this);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(searchAdapter);
    }
}
