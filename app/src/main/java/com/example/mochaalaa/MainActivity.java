package com.example.mochaalaa;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mochaalaa.Activity.Game;
import com.example.mochaalaa.Activity.PayPalConfig;
import com.example.mochaalaa.Activity.bf4detail;
import com.example.mochaalaa.Activity.breakfastCatActivity;
import com.example.mochaalaa.Activity.machineCat;
import com.example.mochaalaa.Activity.profile;
import com.example.mochaalaa.Activity.sweetCatActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;


public class MainActivity extends AppCompatActivity {
    private TextView usernameHomePage;
    private ImageView icedCoffee;
    private ImageView hotCoffee;
    private ImageView SweetsCat;
    private ImageView Breakfast;
    private ImageView machine;
    private Button goToD1;
    private Button goToD2;
    private Button goToD3;

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
        machine = findViewById(R.id.catimg5);
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
                navigateToProfile(userName, userEmail);

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
                navigateToProfile(userName, userEmail);
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
        machine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to Iced Coffee Category Activity
                Intent intent = new Intent(MainActivity.this, machineCat.class);
                startActivity(intent);
            }
        });
        goToD1=findViewById(R.id.hotit1Detail);
        goToD1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to Iced Coffee Category Activity
                Intent intent = new Intent(MainActivity.this, DetailHot1.class);
                startActivity(intent);
            }
        });
        goToD2=findViewById(R.id.p2Detail);
        goToD2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to Iced Coffee Category Activity
                Intent intent = new Intent(MainActivity.this, DetailIced7.class);
                startActivity(intent);
            }
        });
        goToD3=findViewById(R.id.p3Detail);
        goToD3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to Iced Coffee Category Activity
                Intent intent = new Intent(MainActivity.this, bf4detail.class);
                startActivity(intent);
            }
        });


    }

    private void navigateToProfile(String userName, String userEmail) {
        Intent intent = new Intent(MainActivity.this, profile.class);
        intent.putExtra("USER_NAME", userName);
        intent.putExtra("USER_EMAIL", userEmail);
        startActivity(intent);
    }
}



