package com.example.mochaalaa;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class CategoryHotCoffee extends AppCompatActivity {
    private Button goToD1;
    private Button goToD2;
    private Button goToD3;
    private ImageView goback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.category_hotcoffee);

        goToD1=findViewById(R.id.hotit1Detail);
        goToD1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to Iced Coffee Category Activity
                Intent intent = new Intent(CategoryHotCoffee.this, DetailHot1.class);
                startActivity(intent);
            }
        });
        goToD2=findViewById(R.id.hotit2Detail);
        goToD2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to Iced Coffee Category Activity
                Intent intent = new Intent(CategoryHotCoffee.this, DetailHot2.class);
                startActivity(intent);
            }
        });
        goToD3=findViewById(R.id.hotit3Detail);
        goToD3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to Iced Coffee Category Activity
                Intent intent = new Intent(CategoryHotCoffee.this, DetailHot3.class);
                startActivity(intent);
            }
        });

        goback=findViewById(R.id.icedgoback);
        goback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to Iced Coffee Category Activity
                Intent intent = new Intent(CategoryHotCoffee.this, MainActivity.class);
                startActivity(intent);
            }
        });




      }

}
