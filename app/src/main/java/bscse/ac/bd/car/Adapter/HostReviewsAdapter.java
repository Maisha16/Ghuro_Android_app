package bscse.ac.bd.car.Adapter;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class HostReviewsAdapter extends RecyclerView.Adapter<HostReviewsAdapter.ReviewsViewHolder> {


    @NonNull
    @Override
    public ReviewsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ReviewsViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 4;
    }

    class ReviewsViewHolder extends RecyclerView.ViewHolder{

        public ReviewsViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

}
