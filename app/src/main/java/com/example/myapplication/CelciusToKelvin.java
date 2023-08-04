package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class CelciusToKelvin extends AppCompatActivity {
    EditText kelvintext;
    Button kelvin_converter;

    TextView kelvin_result;
    ImageView pound, meter, gram;

    Editable input;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_celcius_to_kelvin);

        kelvintext = findViewById(R.id.kelvintext);
        kelvin_converter = findViewById(R.id.kelvin_converter);
        pound = findViewById(R.id.pound);
        meter = findViewById(R.id.meter);
        gram = findViewById(R.id.gram);
        kelvin_result = findViewById(R.id.kelvin_result);

        kelvin_converter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                input = kelvintext.getText();
                int a = Integer.parseInt(String.valueOf(kelvintext.getText()));
                kelvin_result.setText("Result: "+ input +" Celcius is equal to "+(a+273)+" Kelvin");
                kelvintext.setText("");


            }
        });



        pound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CelciusToKelvin.this,KgToPound.class);
                startActivity(intent);
            }
        });

        meter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CelciusToKelvin.this,MeterToFeet.class);
                startActivity(intent);
            }
        });

        gram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CelciusToKelvin.this,KgToGram.class);
                startActivity(intent);
            }
        });


    }
}


