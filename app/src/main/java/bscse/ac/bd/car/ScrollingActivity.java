package bscse.ac.bd.car;

import android.app.DatePickerDialog;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;
import java.util.List;

import bscse.ac.bd.car.api.Api;
import bscse.ac.bd.car.api.CarService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ScrollingActivity extends AppCompatActivity {


    private TextView startDate;
    private TextView endDate;
    final Calendar myCalendar = Calendar.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        startDate = findViewById(R.id.date_from);
        endDate = findViewById(R.id.date_to);
        startDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startDatePicker();
            }
        });
        endDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                endDatePicker();
            }
        });
//        CarService carService = Api.carService();
//        Call<List<Dummy>> repos = carService.listRepos(1);
//        repos.enqueue(new Callback<List<Dummy>>() {
//            @Override
//            public void onResponse(Call<List<Dummy>> call, Response<List<Dummy>> response) {
//                int i = 0;
//            }
//
//            @Override
//            public void onFailure(Call<List<Dummy>> call, Throwable t) {
//
//            }
//        });

    }

    private void startDatePicker(){
        new DatePickerDialog(ScrollingActivity.this, onStartDatePicked(), myCalendar
                .get(Calendar.YEAR), myCalendar.get(Calendar.MONTH),
                myCalendar.get(Calendar.DAY_OF_MONTH)).show();
    }

    private void endDatePicker(){
        new DatePickerDialog(ScrollingActivity.this, onEndDatePicked(), myCalendar
                .get(Calendar.YEAR), myCalendar.get(Calendar.MONTH),
                myCalendar.get(Calendar.DAY_OF_MONTH)).show();
    }

    private DatePickerDialog.OnDateSetListener onStartDatePicked() {
        return new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year,
                                  int month, int dayOfMonth) {
                String s = year + " - "
                        + month + " - " + dayOfMonth;
                startDate.setText(s);
            }
        };
    }

    private DatePickerDialog.OnDateSetListener onEndDatePicked() {
        return new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year,
                                  int month, int dayOfMonth) {
                String s = year+ " - "
                        + month + " - "+ dayOfMonth;
                endDate.setText(s);
            }
        };
    }
}
