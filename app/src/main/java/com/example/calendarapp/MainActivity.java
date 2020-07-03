package com.example.calendarapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    CalendarView calendarView;
    TextView selectedDate;
    Calendar calendarEvent;
    Button addEvent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calendarView = (CalendarView) findViewById(R.id.calendarView);
        selectedDate = (TextView) findViewById(R.id.selectedDate);

        addEvent = (Button) findViewById(R.id.addEvent);
        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                String date = dayOfMonth + "/" + month + "/" + year;
                selectedDate.setText(date);
            }
        });
    }


    public void AddEvent(View view){
        Intent intent = new Intent(this, AddEvent.class);
        startActivity(intent);

    }


}
