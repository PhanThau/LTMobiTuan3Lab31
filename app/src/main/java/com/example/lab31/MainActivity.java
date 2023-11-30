package com.example.lab31;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editFahren, editCelsius;
    Button btnclear, btnConvert, btnFahren;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editCelsius = findViewById(R.id.editCelsius);
        editFahren= findViewById(R.id.editFahren);
        btnFahren = findViewById(R.id.btnFahren);
        btnConvert = findViewById(R.id.btnConvert);
        btnclear = findViewById(R.id.btnclear);

        btnFahren.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int C = Integer.parseInt(editCelsius.getText().toString());
                Double F = C*1.8 + 32;
                editFahren.setText(F + "");
            }
        });
        btnConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int F = Integer.parseInt(editFahren.getText().toString());
                Double C = (F-32)/1.8;
                editCelsius.setText(C+"");
            }
        });
        btnclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editCelsius.setText("");
                editFahren.setText("");
            }
        });
    }
}