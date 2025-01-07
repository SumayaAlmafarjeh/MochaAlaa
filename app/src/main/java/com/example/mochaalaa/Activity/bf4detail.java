package com.example.mochaalaa.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mochaalaa.CategoryHotCoffee;
import com.example.mochaalaa.DetailHot2;
import com.example.mochaalaa.MainActivity;
import com.example.mochaalaa.R;
import com.example.mochaalaa.cart_page;

public class bf4detail extends AppCompatActivity {
    private ImageView goback;
    private RadioButton whiteBread, brownBread;
    private CheckBox tomato, olive, lettuce, mayonnaise;
    private Button addToCart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.bf4detail);
        goback=findViewById(R.id.d16back);
        goback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to Iced Coffee Category Activity
                Intent intent = new Intent(bf4detail.this, breakfastCatActivity.class);
                startActivity(intent);
            }
        });
    whiteBread = findViewById(R.id.low);
    brownBread = findViewById(R.id.med);
    tomato = findViewById(R.id.tomatoFilling);
    olive = findViewById(R.id.cheeseFilling);
    lettuce = findViewById(R.id.lettuceFilling);
    mayonnaise = findViewById(R.id.vanillaFilling);
    addToCart = findViewById(R.id.Add);

        addToCart.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            // Collect selected options
            String breadType = "";
            if (whiteBread.isChecked()) {
                breadType = "White";
            } else if (brownBread.isChecked()) {
                breadType = "Brown";
            }

            String fillings = "";
            if (tomato.isChecked()) {
                fillings += "Tomato  ";

            }
            if (olive.isChecked()) {
                fillings += ("Olive ");
            }
            if (lettuce.isChecked()) {
                fillings += ("Lettuce ");
            }
            if (mayonnaise.isChecked()) {
                fillings += ("Mayonnaise ");
            }

            // Validate selection
            if (breadType.isEmpty()) {
                Toast.makeText(bf4detail.this, "Please select a bread type.", Toast.LENGTH_SHORT).show();
                return;
            }

            if (fillings.length() == 0) {
                Toast.makeText(bf4detail.this, "Please select at least one filling.", Toast.LENGTH_SHORT).show();
                return;
            }

            // Create item object and add to cart
            String itemName = "Turkey Croissant";
            int itemImage = R.drawable.d29;
            double itemPrice=2.40;

            // Create the new item
            ItemTry newItem = new ItemTry(itemName,breadType,fillings, itemImage,itemPrice);

            ManagmentCart.getInstance().addItem(newItem);

            Toast.makeText(bf4detail.this, "Item added to cart!", Toast.LENGTH_SHORT).show();

            // Navigate to another activity (e.g., main menu or cart page)
            Intent intent = new Intent(bf4detail.this, breakfastCatActivity.class);
            startActivity(intent);
        }
    });
}
};
