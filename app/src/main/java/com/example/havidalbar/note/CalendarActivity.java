package com.example.havidalbar.note;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;

public class CalendarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calendar);
        CalendarView simpleCalendarView = (CalendarView) findViewById(R.id.kalender); // get the reference of CalendarView
        long selectedDate = simpleCalendarView.getDate(); // get selected date in milliseconds
        CalendarView simpleCalendarView1 = (CalendarView) findViewById(R.id.kalender); // get the reference of CalendarView
        simpleCalendarView.setDate(selectedDate); // set selected date 22 May 2016 in milliseconds
    }public void onClick13(View v) {
        Intent intent = new Intent(CalendarActivity.this, input2Activity.class);
        startActivity(intent);
    }
}
