package com.example.mochaalaa;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mochaalaa.Activity.CartAdapter;
import com.example.mochaalaa.Activity.ItemTry;
import com.example.mochaalaa.Activity.ManagmentCart;

import java.util.List;

public class cart_page extends AppCompatActivity {
    private ImageView goback;
    private RecyclerView recyclerView;
    private CartAdapter cartAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cart_page);
        goback=findViewById(R.id.goback);
        goback.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Navigate to Iced Coffee Category Activity
                Intent intent = new Intent(cart_page.this, MainActivity.class);
                startActivity(intent);
            }
        });
        RecyclerView cartRecyclerView = findViewById(R.id.cartRecyclerView);
        cartRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<ItemTry> cartItems = ManagmentCart.getInstance().getCartItems();
        CartAdapter cartAdapter = new CartAdapter(cartItems);
        cartRecyclerView.setAdapter(cartAdapter);
        TextView tvSubTotalValue = findViewById(R.id.tvSubtotalValue);
        TextView tvTotalValue = findViewById(R.id.tvTotalValue);
        double subtotalPrice = calculateTotalPrice(cartItems);
        tvSubTotalValue.setText("JOD " + String.format("%.2f", subtotalPrice));
        double totalPrice =subtotalPrice+2;
        tvTotalValue.setText("JOD " + String.format("%.2f", totalPrice));




    }
    private double calculateTotalPrice(List<ItemTry> cartItems) {
        double total = 0;
        for (ItemTry item : cartItems) {
            total += item.getPrice();
        }
        return total;
    }
}