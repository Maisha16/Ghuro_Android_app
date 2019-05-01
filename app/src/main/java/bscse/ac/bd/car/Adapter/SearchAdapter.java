package bscse.ac.bd.car.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

import bscse.ac.bd.car.R;
import bscse.ac.bd.car.SearchVehicle;

public class SearchAdapter extends RecyclerView.Adapter<SearchAdapter.SearchViewHolder> {
    private List<SearchVehicle> vehicles;
    private OnItemClickListener onItemClickListener;
    public SearchAdapter(List<SearchVehicle> vehicles,
                         OnItemClickListener onItemClickListener) {
        this.vehicles = vehicles;
        this.onItemClickListener = onItemClickListener;
    }

    @NonNull
    @Override
    public SearchViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new SearchAdapter.SearchViewHolder(LayoutInflater.from(parent.getContext())
              .inflate(R.layout.item_search_layout, parent, false), this
        .onItemClickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull SearchViewHolder holder, int position) {
        SearchVehicle vehicle = vehicles.get(position);
        holder.carNum.setText(vehicle.getCarName());
        holder.carModel.setText(vehicle.getCarModel());
        holder.Year.setText(vehicle.getYear());
        holder.Trips.setText(vehicle.getTrips());
        holder.carPrice.setText(vehicle.getPrice());
        Glide.with(holder.itemView.getContext())
                .load(R.drawable.car1)
                .override(1024, 640)
                .into(holder.Image);
    }

    @Override
    public int getItemCount() {
        return this.vehicles.size();
    }


    class SearchViewHolder extends RecyclerView.ViewHolder {

        TextView carNum;
        TextView carModel;
        TextView carPrice;
        TextView Trips;
        TextView Year;
        private OnItemClickListener onItemClickListener;
        ImageView Image;


        public SearchViewHolder(@NonNull View itemView,
                                OnItemClickListener onItemClickListener) {
            super(itemView);
            carNum=itemView.findViewById(R.id.carname);
            carModel=itemView.findViewById(R.id.carmodel);
            carPrice=itemView.findViewById(R.id.carprice);
            Image=itemView.findViewById(R.id.car_pic);
            Trips=itemView.findViewById(R.id.trips);
            Year = itemView.findViewById(R.id.caryear);
            this.onItemClickListener = onItemClickListener;
            itemView.setOnClickListener(onItemClick());
        }

        private View.OnClickListener onItemClick() {
            return new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(onItemClickListener != null) {
                        onItemClickListener.onItemClick(SearchAdapter.
                                this.vehicles.get(getAdapterPosition()));
                    }
                }
            };
        }
    }

    public interface OnItemClickListener {
        void onItemClick(SearchVehicle vehicle);
    }
}
