package bscse.ac.bd.car;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import bscse.ac.bd.car.Fragment.HostFragment;
import bscse.ac.bd.car.Fragment.ProfileFragment;
import bscse.ac.bd.car.Fragment.MessageFragment;
import bscse.ac.bd.car.Fragment.SearchFragment;
import bscse.ac.bd.car.Fragment.TripsFragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {


    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navigationView=findViewById(R.id.bottom_nav);
       final SearchFragment searchFragment;
        searchFragment = new SearchFragment();
        final ProfileFragment profileFragment=new ProfileFragment();
        final MessageFragment messageFragment=new MessageFragment();
        final TripsFragment tripsFragment=new TripsFragment();
        final HostFragment hostFragment=new HostFragment();
        toolbar=findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);


        navigationView. setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                int id=menuItem.getItemId();
                if(id==R.id.search)
                {
                    setFragment(searchFragment);
                    return true;
                }
                else if(id==R.id.profile){
                    setFragment(profileFragment);
                    return true;


                }
                else if(id==R.id.message){
                    setFragment(messageFragment);
                    return true;

                }
                else if(id==R.id.trips){
                    setFragment(tripsFragment);
                    return true;

                }
                else if(id==R.id.host) {
                    setFragment(hostFragment);
                    return true;
                }


                return false;
            }
        });
        navigationView.setSelectedItemId(R.id.search);

    }

    private void setFragment(Fragment fragment)
    {
        FragmentTransaction fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container,fragment);
        fragmentTransaction.commit();
    }
}

