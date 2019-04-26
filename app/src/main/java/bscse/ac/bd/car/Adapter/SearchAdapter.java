package bscse.ac.bd.car.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import bscse.ac.bd.car.R;
import bscse.ac.bd.car.SearchVehicle;

public class SearchAdapter extends RecyclerView.Adapter<SearchAdapter.SearchViewHolder> {
    private List<SearchVehicle> vehicles;
    public SearchAdapter(List<SearchVehicle> vehicles) {
        this.vehicles = vehicles;
    }

    @NonNull
    @Override
    public SearchViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new SearchAdapter.SearchViewHolder(LayoutInflater.from(parent.getContext())
              .inflate(R.layout.item_search_layout, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull SearchViewHolder holder, int position) {
        SearchVehicle vehicle = vehicles.get(position);
        holder.carNum.setText(vehicle.getCar_num());
        holder.carPrice.setText(vehicle.getPrice());
        holder.Trips.setText(vehicle.getTrips());
        holder.Year.setText(vehicle.getYear());
    }

    @Override
    public int getItemCount() {
        return vehicles.size();
    }


    class SearchViewHolder extends RecyclerView.ViewHolder {

        TextView carNum;
        TextView carPrice;
        TextView Trips;
        TextView Year;


        public SearchViewHolder(@NonNull View itemView) {
            super(itemView);
            carNum=itemView.findViewById(R.id.carname);
            carPrice=itemView.findViewById(R.id.price);
            Trips=itemView.findViewById(R.id.trips);
            Year = itemView.findViewById(R.id.year);

        }
    }
}
