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

public class KgToGram extends AppCompatActivity {

    EditText kgtext;
    Button kg_converter;

    TextView kg_result;
    ImageView pound, meter, temp;

    Editable input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kg_to_gram);

        kgtext = findViewById(R.id.kgtext);
        kg_converter = findViewById(R.id.kg_converter);
        pound = findViewById(R.id.pound);
        meter = findViewById(R.id.meter);
        temp = findViewById(R.id.temp);
        kg_result = findViewById(R.id.kg_result);

        kg_converter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                input = kgtext.getText();
                int a = Integer.parseInt(String.valueOf(kgtext.getText()));
                kg_result.setText("Result: "+ input +" Kg is equal to "+a*1000+" Gram");
                kgtext.setText("");


            }
        });



        pound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(KgToGram.this,KgToPound.class);
                startActivity(intent);
            }
        });

        meter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(KgToGram.this,MeterToFeet.class);
                startActivity(intent);
            }
        });

        temp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(KgToGram.this,CelciusToKelvin.class);
                startActivity(intent);
            }
        });



    }
}