package com.example.myfirstapp;

import android.os.Bundle;
import android.widget.CalendarView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

        CalendarView calendarView;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            calendarView = findViewById(R.id.calendarView);

            calendarView.setOnDateChangeListener((view, year, month, dayOfMonth) -> {
                // Do something when a date is selected
            });
        }
    }
