package bscse.ac.bd.car.Fragment;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;

import bscse.ac.bd.car.EditActivity;
import bscse.ac.bd.car.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ProfileFragment extends Fragment {


    public ProfileFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final RelativeLayout mRelativeLayout=(RelativeLayout) inflater.inflate(R.layout.fragment_profile, container, false);

        Button button=mRelativeLayout.findViewById(R.id.
                );

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(getActivity(), EditActivity.class);

                startActivity(intent);
            }
        });

        return mRelativeLayout;
    }



}
