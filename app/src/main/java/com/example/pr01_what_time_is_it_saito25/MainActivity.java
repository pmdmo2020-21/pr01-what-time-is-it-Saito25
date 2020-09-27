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
        TextView lblFecha = findViewById(R.id.lblfecha);
        TextView lblTime = findViewById(R.id.lbltime);
        lblFecha.setText(getCurrentDate("dd/LL/yyyy"));
        lblTime.setText(getCurrentDate("HH:mm"));

    }

    private String getCurrentDate(String formato) {
        Date date = new Date();
        SimpleDateFormat formateador = new SimpleDateFormat(formato);

        return formateador.format(date);
    }
}