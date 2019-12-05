package com.example.appfechayhora;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity{
    private Button pickerBtn,horaBtn;
    private DatePickerDialog datePickerDialog;
    private TimePickerDialog timePickerDialog;
    private Toast toast;
    private String date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void mostrarDatePicker(View v){
        datePickerDialog = new DatePickerDialog(MainActivity.this,
            new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                    date = String.valueOf(year+ "/" +month+ "/" +day);
                    toast.makeText(getApplicationContext(), date, Toast.LENGTH_LONG).show();

                }
            },2019,11, 5);
        datePickerDialog.show();
    }

    public void mostrarHora(View v){
        timePickerDialog = new TimePickerDialog(MainActivity.this,
                new TimePickerDialog.OnTimeSetListener() {
                @Override
                public void onTimeSet(TimePicker view, int hora, int minuto) {

                    String AM_PM;
                    if(hora < 12) {
                        AM_PM = "a.m.";
                    } else {
                        AM_PM = "p.m.";
                    }
                    date = String.valueOf(hora + ":" + minuto + " " + AM_PM);
                    toast.makeText(getApplicationContext(), date, Toast.LENGTH_LONG).show();

                }
            },0 , 0,false);
            timePickerDialog.show();
    }

}

