package bscse.ac.bd.car.Fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

import bscse.ac.bd.car.Adapter.HostVehicleAdapter;
import bscse.ac.bd.car.Adapter.SearchAdapter;
import bscse.ac.bd.car.R;
import bscse.ac.bd.car.SearchVehicle;
import bscse.ac.bd.car.Vehicle;

/**
 * A simple {@link Fragment} subclass.
 */
public class SearchFragment extends Fragment {


    public SearchFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_search, container, false);
        final RecyclerView recyclerView = (RecyclerView)  v.findViewById(R.id.searchRecylerView);
        List<SearchVehicle> vehicles = new ArrayList<>();
        vehicles.add(new SearchVehicle("Honda Accord","119tk","17 trips","2018"));
        SearchAdapter searchAdapter = new SearchAdapter(vehicles);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(searchAdapter);

        return v;
    }

}
