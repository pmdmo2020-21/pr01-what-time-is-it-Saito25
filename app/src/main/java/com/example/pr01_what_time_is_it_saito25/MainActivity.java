package com.example.pr01_what_time_is_it_saito25;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView[] lblsDateAndTime = new TextView[4];
        lblsDateAndTime[0] = findViewById(R.id.lblfecha);
        lblsDateAndTime[1] = findViewById(R.id.lbltime);
        lblsDateAndTime[2] = findViewById(R.id.lbltitulo);
        lblsDateAndTime[3] = findViewById(R.id.lblsubtitle);

        lblsDateAndTime[0].setText(getCurrentDate("dd/LL/yyyy"));
        lblsDateAndTime[1].setText(getCurrentDate("HH:mm"));

        for(TextView textView : lblsDateAndTime) {
            textView.setTextSize(50);
        }

    }

    private String getCurrentDate(String formato) {
        Date date = new Date();
        SimpleDateFormat formateador = new SimpleDateFormat(formato);

        return formateador.format(date);
    }
}