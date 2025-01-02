package com.example.mochaalaa.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mochaalaa.R;
import com.example.mochaalaa.carttry;

public class sweet1detail extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.sweet1detail);

        Button addToCartButton = findViewById(R.id.AddToCart);
        addToCartButton.setOnClickListener(v -> {
            // Collect item information
            String itemName = ((TextView) findViewById(R.id.itemName)).getText().toString();
            ImageView itemImageView = findViewById(R.id.itemImg);
            int imageResourceId = (int) itemImageView.getTag();
            // Example of getting selected size






            // Create Intent to send data
            Intent intent = new Intent(sweet1detail.this, carttry.class);
            intent.putExtra("itemName", itemName);
            intent.putExtra("imageResourceId", imageResourceId);

            startActivity(intent);
        });
    }
};
