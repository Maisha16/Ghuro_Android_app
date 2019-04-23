package bscse.ac.bd.car.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import bscse.ac.bd.car.R;
import bscse.ac.bd.car.Vehicle;

public class HostVehicleAdapter extends RecyclerView.Adapter<HostVehicleAdapter.VehicleViewHolder> {
    private List<Vehicle> vehicles;

    public HostVehicleAdapter(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    @NonNull
    @Override
    public VehicleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new VehicleViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_vehicle_layout, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull VehicleViewHolder holder, int position) {
        Vehicle vehicle = vehicles.get(position);
        holder.carModel.setText(vehicle.getModel());
        holder.carNum.setText(vehicle.getCar_num());
        holder.lastTrips.setText(vehicle.getLasttrips());
        holder.numTrips.setText(vehicle.getNumtrips());
    }

    @Override
    public int getItemCount() {
        return vehicles.size();
    }

    class VehicleViewHolder extends RecyclerView.ViewHolder {

        TextView carModel;
        TextView carNum;
        TextView numTrips;
        TextView lastTrips;


        public VehicleViewHolder(@NonNull View itemView) {
            super(itemView);
            carModel = itemView.findViewById(R.id.tv_car_model);
            carNum=itemView.findViewById(R.id.tv_car_num);
            numTrips=itemView.findViewById(R.id.tv_car_numtrips);
            lastTrips=itemView.findViewById(R.id.tv_car_lasttrips);
        }
    }
}
