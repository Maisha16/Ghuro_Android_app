package bscse.ac.bd.car.Fragment;


import android.os.Bundle;

import androidx.annotation.Nullable;
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
import bscse.ac.bd.car.R;
import bscse.ac.bd.car.Vehicle;

/**
 * A simple {@link Fragment} subclass.
 */
public class HostFragment extends Fragment {


    public HostFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_host, container, false);
        TabLayout tabLayout = (TabLayout) v.findViewById(R.id.tabLayout);
        final RecyclerView recyclerView = (RecyclerView)  v.findViewById(R.id.hostRecylerView);


        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                if(tab.getText().toString().equals("Vehicle")) {
                    Toast.makeText(getActivity(), "Vehicle", Toast.LENGTH_LONG).show();
                    List<Vehicle> vehicles = new ArrayList<>();
                    vehicles.add(new Vehicle("Honda","H08LTR","11 trips","Last trip:Jan 18-Jan 19 "));
//                    vehicles.add(new Vehicle("Toyota"));
//                    vehicles.add(new Vehicle("Acura"));
                    HostVehicleAdapter hostVehicleAdapter = new HostVehicleAdapter(vehicles);
                    recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
                    recyclerView.setAdapter(hostVehicleAdapter);
                } else if(tab.getText().toString().equals("Reviews")) {
//                    List<Vehicle> vehicles = new ArrayList<>();
//                    vehicles.add(new Vehicle("Pussy"));
//                    vehicles.add(new Vehicle("Nipplle"));
//                    vehicles.add(new Vehicle("Vegina"));
//                    HostVehicleAdapter hostVehicleAdapter = new HostVehicleAdapter(vehicles);
//                    recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
//                    recyclerView.setAdapter(hostVehicleAdapter);
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        return v;
    }


}

