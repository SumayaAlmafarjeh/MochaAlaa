package com.example.mochaalaa;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.mochaalaa.Activity.ItemTry;
import com.example.mochaalaa.Activity.ManagmentCart;

public class DetailHot2 extends AppCompatActivity {
    private ImageView goback;
    private CheckBox whippedCreamCheckBox, chocolateToppingCheckBox;
    RadioButton smallRadioButton, mediumRadioButton, largeRadioButton;
    RadioButton lowSugarRadioButton, mediumSugarRadioButton, highSugarRadioButton;
    Button addToCart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hot_detail2);

        goback=findViewById(R.id.hotD2);
        goback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to Iced Coffee Category Activity
                Intent intent = new Intent(DetailHot2.this, CategoryHotCoffee.class);
                startActivity(intent);
            }
        });
        whippedCreamCheckBox = findViewById(R.id.whipCream);
        chocolateToppingCheckBox = findViewById(R.id.chocolateTopping);
        smallRadioButton = findViewById(R.id.low);
        mediumRadioButton = findViewById(R.id.med);
        largeRadioButton = findViewById(R.id.high);
        lowSugarRadioButton = findViewById(R.id.lowSugar);
        mediumSugarRadioButton = findViewById(R.id.medSugar); // Ensure you have this ID in your layout
        highSugarRadioButton = findViewById(R.id.highSugar);
        addToCart = findViewById(R.id.Addhot2);

        addToCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String size = "Meduim"; // Default

                if (smallRadioButton.isChecked()) {
                    size = "Small";
                } else if (largeRadioButton.isChecked()) {
                    size = "Large";
                }

                String sugar = "Medium"; // Default
                if (lowSugarRadioButton.isChecked()) {
                    sugar = "Low";
                } else if (highSugarRadioButton.isChecked()) {
                    sugar = "High";
                }

                    String topping = "";
                    if (whippedCreamCheckBox.isChecked()) {
                        topping += "Whipped Cream ";
                    }
                    if (chocolateToppingCheckBox.isChecked()) {
                        topping += "Chocolate Shavings ";
                    }
                    if (topping.isEmpty()) {
                        topping = "No Toppings";
                    }

                // Assume these are properly defined for the current item
                String itemName = "Hot Coffee";
                int itemImage = R.drawable.hot2;
                double itemPrice=1.50;

                // Create the new item
                ItemTry newItem = new ItemTry(itemName, size, sugar, topping, itemImage,itemPrice);

                // Add to the cart
                ManagmentCart.getInstance().addItem(newItem);

                // Navigate to cart page
                Intent intent = new Intent(DetailHot2.this, CategoryHotCoffee.class);
                startActivity(intent);
                Toast.makeText(DetailHot2.this, "Added to Cart!", Toast.LENGTH_SHORT).show();
                }
            });
        };
    }