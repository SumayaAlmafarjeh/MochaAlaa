package com.example.mochaalaa;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.mochaalaa.Activity.PayPalConfig;


public class carttry extends AppCompatActivity {

private TextView itemname;
ImageView receiveImage;
Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_carttry);

       /* itemname = findViewById(R.id.tvItem1Name);
        receiveImage = findViewById(R.id.ivItem1);


        intent = getIntent();
        String itemName = intent.getStringExtra("itemName1");
        Uri uri=(Uri) intent.getParcelableExtra("itemImage");

        itemname.setText(itemName);
        receiveImage.setImageURI(uri);*/






    } }
