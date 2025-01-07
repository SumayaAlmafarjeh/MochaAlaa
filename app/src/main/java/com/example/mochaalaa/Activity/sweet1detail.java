package com.example.mochaalaa.Activity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mochaalaa.CategoryPageActivity;
import com.example.mochaalaa.DetailIced1;
import com.example.mochaalaa.MainActivity;
import com.example.mochaalaa.R;
import com.example.mochaalaa.carttry;

import java.io.ByteArrayOutputStream;

public class sweet1detail extends AppCompatActivity {
     Button addToCart;
    ImageView imageVeiwCart;
    Uri uri;
    private TextView textviewCart;
    private ImageView goback;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.sweet1detail);
        addToCart = findViewById(R.id.d16AddToCart);
        imageVeiwCart = findViewById(R.id.itemImg);
        textviewCart = findViewById(R.id.d16itemName);
        goback=findViewById(R.id.d16back);
        goback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to Iced Coffee Category Activity
                Intent intent = new Intent(sweet1detail.this, MainActivity.class);
                startActivity(intent);
            }
        });

        addToCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(sweet1detail.this, carttry.class);


                String itemName = textviewCart.getText().toString();

                intent.putExtra("itemImage",uri);




                intent.putExtra("itemName1", itemName);


                startActivity(intent);
            }
        });

    }
@Override

   protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1 && data != null) {
            uri = data.getData(); // Get the selected image URI
            imageVeiwCart.setImageURI(uri); // Display the image in the current activity

            // Get the text from TextView

        }
    }
}




