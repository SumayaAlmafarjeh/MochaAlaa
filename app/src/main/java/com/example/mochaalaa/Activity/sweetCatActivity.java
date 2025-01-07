package com.example.mochaalaa.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mochaalaa.CategoryHotCoffee;
import com.example.mochaalaa.DetailHot2;
import com.example.mochaalaa.MainActivity;
import com.example.mochaalaa.R;

public class sweetCatActivity extends AppCompatActivity {
    private ImageView goback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sweetscat); // Link the layout
        goback=findViewById(R.id.hotD2);
        goback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to Iced Coffee Category Activity
                Intent intent = new Intent(sweetCatActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        Button sweetButton1 = findViewById(R.id.d16viewDetail);


        // Set OnClickListener
        sweetButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to navigate to DetailActivity
                Intent intent = new Intent(sweetCatActivity.this, sweet1detail.class);

                // Pass data to DetailActivity


                // Start DetailActivity
                startActivity(intent);
    }
        });

        Button sweetButton2 = findViewById(R.id.d17viewDetail);

        // Set OnClickListener
        sweetButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(sweetCatActivity.this, sweet2detail.class);


                startActivity(intent);
            }
        });
        Button sweetButton3 = findViewById(R.id.d32viewDetail);

        // Set OnClickListener
        sweetButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(sweetCatActivity.this, sweet3detail.class);


                startActivity(intent);
            }
        });
        Button sweetButton4 = findViewById(R.id.d34viewDetail);

        // Set OnClickListener
        sweetButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(sweetCatActivity.this, sweet4detail.class);


                startActivity(intent);
            }
        });
        Button sweetButton5 = findViewById(R.id.d35viewDetail);

        // Set OnClickListener
        sweetButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(sweetCatActivity.this, sweet5detail.class);


                startActivity(intent);
            }
        });
        Button sweetButton6 = findViewById(R.id.d36viewDetail);

        // Set OnClickListener
        sweetButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(sweetCatActivity.this, sweet6detail.class);


                startActivity(intent);
            }
        });
        Button sweetButton7 = findViewById(R.id.d37viewDetail);

        // Set OnClickListener
        sweetButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(sweetCatActivity.this, sweet7detail.class);


                startActivity(intent);
            }
        });
        Button sweetButton8 = findViewById(R.id.d31viewDetail);

        // Set OnClickListener
        sweetButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(sweetCatActivity.this, sweet8detail.class);


                startActivity(intent);
            }
        });
    }
}