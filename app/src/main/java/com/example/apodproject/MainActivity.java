package com.example.apodproject;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    TextView s_button;
    TextView e_button;
    Button submit_button;
    private String startDate = "";
    private String endDate = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        s_button =   findViewById(R.id.s_button);
        e_button =   findViewById(R.id.e_button);
        submit_button = findViewById(R.id.submit_button);
       final Calendar calendar = Calendar.getInstance();
       s_button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               int y = calendar.get(Calendar.YEAR);
               int m = calendar.get(Calendar.MONTH);
               int d = calendar.get(Calendar.DAY_OF_MONTH);
               DatePickerDialog s_datePickerDialog = new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
                   @Override
                   public void onDateSet(DatePicker datePicker, int year, int month, int dom) {
                       if(month>=0)
                       {
                           month++;
                           if(month<10&&dom<10){
                               s_button.setText(year+"-"+0+month+"-"+0+dom);
                           }
                           else if(month<10&&dom>=10){
                               s_button.setText(year+"-"+0+month+"-"+dom);
                           }
                           else if(month>=10&&dom>=10)
                           {
                               s_button.setText(year+"-"+month+"-"+dom);
                           }
                           else if(month>=10&&dom<10){
                               s_button.setText(year+"-"+month+"-"+0+dom);
                           }
                       }

                   }
               },y,m,d);
               s_datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
               s_datePickerDialog.show();

           }
       });
           e_button.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   int y2 = calendar.get(Calendar.YEAR);
                   int m2 = calendar.get(Calendar.MONTH);
                   int d2 =calendar.get(Calendar.DAY_OF_MONTH);
                   DatePickerDialog e_datePickerDialog = new DatePickerDialog(MainActivity.this, new DatePickerDialog.OnDateSetListener() {
                       @Override
                       public void onDateSet(DatePicker datePicker, int year2, int month2, int dom2) {
                           if(month2>=0)
                           {
                               month2++;
                               if(month2<10&&dom2<10){
                                   e_button.setText(year2+"-"+0+month2+"-"+0+dom2);
                               }
                               else if(month2<10&&dom2>=10){
                                   e_button.setText(year2+"-"+0+month2+"-"+dom2);
                               }
                               else if(month2>=10&&dom2>=10)
                               {
                                   e_button.setText(year2+"-"+month2+"-"+dom2);
                               }
                               else if(month2>=10&&dom2<10){
                                   e_button.setText(year2+"-"+month2+"-"+0+dom2);
                               }
                           }
                       }
                   },y2,m2,d2);
                   e_datePickerDialog.getDatePicker().setMaxDate(System.currentTimeMillis());
                   e_datePickerDialog.show();
               }
           });
           submit_button.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   startDate = s_button.toString();
                   endDate = e_button.toString();
                   Intent intent = new Intent(MainActivity.this, ApodActivity.class);
                   intent.putExtra("start_date",startDate);
                   intent.putExtra("end_date",endDate);
                   startActivity(intent);
               }
           });

}
}