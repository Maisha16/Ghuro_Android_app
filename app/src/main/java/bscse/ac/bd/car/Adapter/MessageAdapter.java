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

import bscse.ac.bd.car.Messages;
import bscse.ac.bd.car.R;
import bscse.ac.bd.car.SearchVehicle;

public class MessageAdapter extends RecyclerView.Adapter<MessageAdapter.MessageViewHolder> {
    private List<Messages> messages;
    private OnItemClickListener onItemClickListener;
    public MessageAdapter(List<Messages> messages,
                         OnItemClickListener onItemClickListener) {
        this.messages = messages;
        this.onItemClickListener = onItemClickListener;
    }

    @NonNull
    @Override
    public MessageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MessageAdapter.MessageViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_message_layout, parent, false), this
                .onItemClickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull MessageViewHolder holder, int position) {
        Messages message = messages.get(position);
        holder.name.setText(message.getName());
        holder.msg.setText(message.getMessage());

        Glide.with(holder.itemView.getContext())
                .load(R.drawable.car1)
                .override(1024, 640)
                .into(holder.Image);
    }

    @Override
    public int getItemCount() {
        return this.messages.size();
    }


    class MessageViewHolder extends RecyclerView.ViewHolder {

        TextView name;
        TextView msg;

        private OnItemClickListener onItemClickListener;
        ImageView Image;


        public MessageViewHolder(@NonNull View itemView,
                                OnItemClickListener onItemClickListener) {
            super(itemView);
            name=itemView.findViewById(R.id.name);
            msg=itemView.findViewById(R.id.msg);
            Image=itemView.findViewById(R.id.car_pic);

            this.onItemClickListener = onItemClickListener;
            itemView.setOnClickListener(onItemClick());
        }

        private View.OnClickListener onItemClick() {
            return new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(onItemClickListener != null) {
                        onItemClickListener.onItemClick(MessageAdapter.
                                this.messages.get(getAdapterPosition()));
                    }
                }
            };
        }
    }

    public interface OnItemClickListener {
        void onItemClick(Messages vehicle);
    }
}
