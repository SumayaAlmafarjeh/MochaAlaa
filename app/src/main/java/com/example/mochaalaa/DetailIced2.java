package com.example.mochaalaa;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailIced2 extends AppCompatActivity {
    private ImageView goback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.iced_detail2);


        goback=findViewById(R.id.icedD2);
        goback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to Iced Coffee Category Activity
                Intent intent = new Intent(DetailIced2.this, CategoryPageActivity.class);
                startActivity(intent);
            }
        });
    }
}