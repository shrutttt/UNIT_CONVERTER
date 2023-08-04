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

public class MeterToFeet extends AppCompatActivity {

    EditText metertext;
    Button meter_converter;

    TextView meter_result;
    ImageView pound, temp, gram;

    Editable input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meter_to_feet);


        metertext = findViewById(R.id.metertext);
        meter_converter = findViewById(R.id.meter_converter);
        pound = findViewById(R.id.pound);
        temp = findViewById(R.id.temp);
        gram = findViewById(R.id.gram);
        meter_result = findViewById(R.id.meter_result);

        meter_converter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                input = metertext.getText();
                int a = Integer.parseInt(String.valueOf(metertext.getText()));
                meter_result.setText("Result: "+ input +"meter  is equal to "+a*3.281+" feet");
                metertext.setText("");


            }
        });



        pound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MeterToFeet.this,KgToPound.class);
                startActivity(intent);
            }
        });

        gram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MeterToFeet.this,KgToGram.class);
                startActivity(intent);
            }
        });

        temp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MeterToFeet.this,CelciusToKelvin.class);
                startActivity(intent);
            }
        });


    }
}