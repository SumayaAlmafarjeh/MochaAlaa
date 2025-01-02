package com.example.mochaalaa.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.mochaalaa.MainActivity;
import com.example.mochaalaa.R;

public class machineCat extends AppCompatActivity {

    private ImageView goback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.machinecat);

        goback=findViewById(R.id.breakfastgoback2);
        goback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to Iced Coffee Category Activity
                Intent intent = new Intent(machineCat.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

}
