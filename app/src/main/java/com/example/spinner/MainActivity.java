package com.example.spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
   TextView tv;
   Spinner spin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv=findViewById(R.id.tv1);
        spin=findViewById(R.id.spinner);
        String[] fruitsArray=getResources().getStringArray(R.array.fruits);
        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                tv.setText("you have selected"+fruitsArray[position]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

                tv.setText("");
            }
        });
    }
}