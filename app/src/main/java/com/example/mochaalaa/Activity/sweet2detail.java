package com.example.mochaalaa.Activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mochaalaa.MainActivity;
import com.example.mochaalaa.R;
import com.example.mochaalaa.carttry;

public class sweet2detail extends AppCompatActivity {

    Button addToCart;
    ImageView imageVeiwCart;
    private RadioButton withSugar, freesugar;

    private ImageView goback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.sweet2detail);
        addToCart = findViewById(R.id.Add);
        imageVeiwCart = findViewById(R.id.itemImg);
        withSugar = findViewById(R.id.highSugar);
        freesugar = findViewById(R.id.lowSugar);

        goback=findViewById(R.id.d16back);
        goback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to Iced Coffee Category Activity
                Intent intent = new Intent(sweet2detail.this, MainActivity.class);
                startActivity(intent);
            }
        });
        addToCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Collect selected options
                String sugar = "";
                if (withSugar.isChecked()) {
                    sugar = "Normal";
                } else if (freesugar.isChecked()) {
                    sugar = "Free Sugar";
                }




                String itemName = "Cookies";
                int itemImage = R.drawable.d17;
                double itemPrice=0.75;

                // Create the new item
                ItemTry newItem = new ItemTry(itemName,sugar, itemImage,itemPrice);

                ManagmentCart.getInstance().addItem(newItem);

                Toast.makeText(sweet2detail.this, "Item added to cart!", Toast.LENGTH_SHORT).show();

                // Navigate to another activity (e.g., main menu or cart page)
                Intent intent = new Intent(sweet2detail.this, sweetCatActivity.class);
                startActivity(intent);
            }
        });



    }



};
