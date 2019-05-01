package bscse.ac.bd.car.Fragment;


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

import bscse.ac.bd.car.Adapter.SearchAdapter;
import bscse.ac.bd.car.R;
import bscse.ac.bd.car.SearchVehicle;

/**
 * A simple {@link Fragment} subclass.
 */
public class SearchFragment extends Fragment implements SearchAdapter.OnItemClickListener {


    public SearchFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_search, container, false);
        final RecyclerView recyclerView =  v.findViewById(R.id.searchRecylerView);
        List<SearchVehicle> vehicles = new ArrayList<>();
        vehicles.add(new SearchVehicle("Honda", "Accord", "119","17 trips","2018"));
        vehicles.add(new SearchVehicle("Honda", "CIVIC", "119","17 trips","2018"));
        vehicles.add(new SearchVehicle("Honda", "CR-V", "119","17 trips","2018"));
        vehicles.add(new SearchVehicle("Honda", "Type-R", "119","17 trips","2018"));
        SearchAdapter searchAdapter = new SearchAdapter(vehicles, this);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(searchAdapter);

        return v;
    }

    @Override
    public void onItemClick(SearchVehicle vehicle) {
        Toast.makeText(getContext(), vehicle.getCarModel(), Toast.LENGTH_LONG).show();
    }
}
