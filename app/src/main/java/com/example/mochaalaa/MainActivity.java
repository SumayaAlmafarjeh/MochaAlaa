package com.example.mochaalaa;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    private TextView usernameHomePage;
    private ImageView icedCoffee;
    private ImageView hotCoffee;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNav = findViewById(R.id.bottomNav);
        usernameHomePage = findViewById(R.id.usernameHomePage);
         icedCoffee = findViewById(R.id.catimg1);
        hotCoffee = findViewById(R.id.catimg2);
        // Get the name from the intent
        String userName = getIntent().getStringExtra("USERNAME");

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
                setContentView(R.layout.activity_carttry);
            }
        });

        bottomNav.findViewById(R.id.game).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
               // setContentView(R.layout.activity_game);
            }
        });

        bottomNav.findViewById(R.id.settings).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                setContentView(R.layout.activity_infosetter);
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
    }
}



