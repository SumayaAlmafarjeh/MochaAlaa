package com.example.mochaalaa.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.mochaalaa.R;

public class profile extends AppCompatActivity {
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1 && resultCode == RESULT_OK) {
            double lat = data.getDoubleExtra("selectedLat", 0);
            double lng = data.getDoubleExtra("selectedLng", 0);

            // Update address text view with the selected location
            TextView addressText = findViewById(R.id.changeAdressLogOut);
            addressText.setText("" + lat + "," + lng);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_profile);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        TextView adressTextLogOut = findViewById(R.id.adressTextLogOut);
        adressTextLogOut.setOnClickListener(v -> {
            Intent intent = new Intent(profile.this, map.class);
            startActivityForResult(intent, 1); // Using startActivityForResult for result handling
        });

    }
}