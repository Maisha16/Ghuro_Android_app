package bscse.ac.bd.car;

import android.app.DatePickerDialog;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Parcelable;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class BookingActivity extends AppCompatActivity {


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


    }

    @Override
    protected void onResume() {
        super.onResume();
        SearchVehicle vehicle = getIntent().getParcelableExtra("vehicle");
        Toast.makeText(getApplicationContext(), vehicle.getCarModel(), Toast.LENGTH_LONG).show();
    }

    private void startDatePicker(){
        new DatePickerDialog(BookingActivity.this, onStartDatePicked(), myCalendar
                .get(Calendar.YEAR), myCalendar.get(Calendar.MONTH),
                myCalendar.get(Calendar.DAY_OF_MONTH)).show();
    }

    private void endDatePicker(){
        new DatePickerDialog(BookingActivity.this, onEndDatePicked(), myCalendar
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
