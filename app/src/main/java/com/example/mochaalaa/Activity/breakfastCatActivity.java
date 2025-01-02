package com.example.mochaalaa.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mochaalaa.R;

public class breakfastCatActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.breakfastcat); // Link the layout
        Button bfButton1 = findViewById(R.id.d39viewDetail);

        // Set OnClickListener
        bfButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to navigate to DetailActivity
                Intent intent = new Intent(breakfastCatActivity.this, sd1detail.class);


                startActivity(intent);
            }
        });

        Button bfButton2 = findViewById(R.id.foodbfviewDetail);

        // Set OnClickListener
        bfButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to navigate to DetailActivity
                Intent intent = new Intent(breakfastCatActivity.this, bf2detail.class);


                startActivity(intent);
            }
        });
        Button bfButton3 = findViewById(R.id.d18viewDetail);

        // Set OnClickListener
        bfButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to navigate to DetailActivity
                Intent intent = new Intent(breakfastCatActivity.this, bf3detail.class);


                startActivity(intent);
            }
        });
        Button bfButton4 = findViewById(R.id.d29viewDetail);

        // Set OnClickListener
        bfButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to navigate to DetailActivity
                Intent intent = new Intent(breakfastCatActivity.this, bf4detail.class);


                startActivity(intent);
            }
        });
        Button bfButton5 = findViewById(R.id.d22viewDetail);

        // Set OnClickListener
        bfButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to navigate to DetailActivity
                Intent intent = new Intent(breakfastCatActivity.this, bf5detail.class);


                startActivity(intent);
            }
        });
        Button bfButton6 = findViewById(R.id.d28viewDetail);

        // Set OnClickListener
        bfButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to navigate to DetailActivity
                Intent intent = new Intent(breakfastCatActivity.this, bf6detail.class);


                startActivity(intent);
            }
        });
        Button bfButton7 = findViewById(R.id.d25viewDetail);

        // Set OnClickListener
        bfButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to navigate to DetailActivity
                Intent intent = new Intent(breakfastCatActivity.this, bf7detail.class);


                startActivity(intent);
            }
        });
        Button bfButton8 = findViewById(R.id.d27viewDetail);

        // Set OnClickListener
        bfButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create an Intent to navigate to DetailActivity
                Intent intent = new Intent(breakfastCatActivity.this, bf8detail.class);


                startActivity(intent);
            }
        });
    }


    }
