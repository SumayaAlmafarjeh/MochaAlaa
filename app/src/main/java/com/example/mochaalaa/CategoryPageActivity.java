package com.example.mochaalaa;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class CategoryPageActivity extends AppCompatActivity {

    private Button goToD1;
    private Button goToD2;
    private Button goToD3;
    private Button goToD4;
    private Button goToD5;
    private Button goToD6;
    private Button goToD7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category_icedcoffee);

        goToD1=findViewById(R.id.icedit1Detail);
        goToD1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to Iced Coffee Category Activity
                Intent intent = new Intent(CategoryPageActivity.this, DetailIced1.class);
                startActivity(intent);
            }
        });
        goToD2=findViewById(R.id.icedit2Detail);
        goToD2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to Iced Coffee Category Activity
                Intent intent = new Intent(CategoryPageActivity.this, DetailIced2.class);
                startActivity(intent);
            }
        });
        goToD3=findViewById(R.id.icedit3Detail);
        goToD3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to Iced Coffee Category Activity
                Intent intent = new Intent(CategoryPageActivity.this, DetailIced3.class);
                startActivity(intent);
            }
        });
        goToD4=findViewById(R.id.icedit4Detail);
        goToD4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to Iced Coffee Category Activity
                Intent intent = new Intent(CategoryPageActivity.this, DetailIced4.class);
                startActivity(intent);
            }
        });
        goToD5=findViewById(R.id.icedit5Detail);
        goToD5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to Iced Coffee Category Activity
                Intent intent = new Intent(CategoryPageActivity.this, DetailIced5.class);
                startActivity(intent);
            }
        });
        goToD6=findViewById(R.id.icedit6Detail);
        goToD6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to Iced Coffee Category Activity
                Intent intent = new Intent(CategoryPageActivity.this, DetailIced6.class);
                startActivity(intent);
            }
        });
        goToD7=findViewById(R.id.icedit7Detail);
        goToD7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to Iced Coffee Category Activity
                Intent intent = new Intent(CategoryPageActivity.this, DetailIced7.class);
                startActivity(intent);
            }
        });


    }

}
