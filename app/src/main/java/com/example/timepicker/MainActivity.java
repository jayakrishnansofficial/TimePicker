package com.example.timepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    TimePicker timePicker;
    Button button;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        timePicker = (TimePicker)findViewById(R.id.timepicker);
        timePicker.setIs24HourView(true);
        button = (Button)findViewById(R.id.button);
        textView = (TextView)findViewById(R.id.textview);

        textView.setText(getCurrentTime());

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText(getCurrentTime());
            }
        });
    }

    public String getCurrentTime(){
        String currenttime = "Current Time : "+timePicker.getCurrentHour()+":"+timePicker.getCurrentMinute();
        return currenttime;
    }

}
