package bscse.ac.bd.car.Fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.Objects;

import bscse.ac.bd.car.Adapter.MessageAdapter;
import bscse.ac.bd.car.Messages;
import bscse.ac.bd.car.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class MessageFragment extends Fragment implements MessageAdapter.OnItemClickListener {


    public MessageFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=  inflater.inflate(R.layout.fragment_message, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.messageRecylerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(new MessageAdapter(new ArrayList<Messages>(), this));
        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        Objects.requireNonNull(getActivity()).setTitle("Messages");
    }

    @Override
    public void onItemClick(Messages vehicle) {

    }
}
