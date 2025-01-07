package com.example.mochaalaa;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mochaalaa.Activity.Game;
import com.example.mochaalaa.Activity.PayPalConfig;
import com.example.mochaalaa.Activity.breakfastCatActivity;
import com.example.mochaalaa.Activity.profile;
import com.example.mochaalaa.Activity.sweetCatActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;


public class MainActivity extends AppCompatActivity {
    private TextView usernameHomePage;
    private ImageView icedCoffee;
    private ImageView hotCoffee;
    private ImageView SweetsCat;
    private ImageView Breakfast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);



        BottomNavigationView bottomNav = findViewById(R.id.bottomNav);
        usernameHomePage = findViewById(R.id.usernameHomePage);
         icedCoffee = findViewById(R.id.catimg1);
        hotCoffee = findViewById(R.id.catimg2);
        SweetsCat = findViewById(R.id.catimg4);
        Breakfast = findViewById(R.id.catimg3);
        // Get the name from the intent
        String userName = getIntent().getStringExtra("USERNAME");
        String userEmail = getIntent().getStringExtra("USER_EMAIL");


        if (userName != null && !userName.isEmpty()) {
            usernameHomePage.setText("Hi " + userName);
        } else {
            usernameHomePage.setText("Hi Guest"); // Fallback text
        }



        //**********************navbar***********************
        bottomNav.findViewById(R.id.home).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_profile);
            }
        });

        bottomNav.findViewById(R.id.profile).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_profile); // Switch to Profile layout
            }
        });

        bottomNav.findViewById(R.id.cart).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, cart_page.class);
                startActivity(intent);
            }
        });

        bottomNav.findViewById(R.id.game).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Game.class);
                startActivity(intent);
            }
        });

        bottomNav.findViewById(R.id.settings).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, profile.class);
                intent.putExtra("USER_NAME", userName);
                intent.putExtra("USER_EMAIL", userEmail);
                startActivity(intent);
            }
        });

        //go to first category
        icedCoffee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to Iced Coffee Category Activity
                Intent intent = new Intent(MainActivity.this, CategoryPageActivity.class);
                startActivity(intent);
            }
        });

        //go to second category
        hotCoffee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to Iced Coffee Category Activity
                Intent intent = new Intent(MainActivity.this, CategoryHotCoffee.class);
                startActivity(intent);
            }
        });
        SweetsCat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to Iced Coffee Category Activity
                Intent intent = new Intent(MainActivity.this, sweetCatActivity.class);
                startActivity(intent);
            }
        });
       Breakfast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to Iced Coffee Category Activity
                Intent intent = new Intent(MainActivity.this, breakfastCatActivity.class);
                startActivity(intent);
            }
        });


    }
}



