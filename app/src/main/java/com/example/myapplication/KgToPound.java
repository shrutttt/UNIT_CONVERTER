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

public class KgToPound extends AppCompatActivity {
    EditText poundtext;
    Button pound_converter;

    TextView pound_result;
    ImageView gram, meter, temp;

    Editable input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kg_to_pound);

        poundtext = findViewById(R.id.poundtext);
        pound_converter = findViewById(R.id.pound_converter);
        pound_result = findViewById(R.id.pound_result);
        gram = findViewById(R.id.gram);
        meter = findViewById(R.id.meter);
        temp = findViewById(R.id.temp);



        pound_converter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                input = poundtext.getText();
                int a = Integer.parseInt(String.valueOf(poundtext.getText()));
                pound_result.setText("Result: "+ input +" Kg is equal to "+(a*2.20)+" Pound");
                poundtext.setText("");

            }
        });



        gram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(KgToPound.this,KgToGram.class);
                startActivity(intent);
            }
        });

        meter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(KgToPound.this,MeterToFeet.class);
                startActivity(intent);
            }
        });

        temp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(KgToPound.this,CelciusToKelvin.class);
                startActivity(intent);
            }
        });



    }
}