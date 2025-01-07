package com.example.mochaalaa.Activity;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mochaalaa.R;

import java.util.List;

public class CartAdapter  extends RecyclerView.Adapter<CartAdapter.CartViewHolder> {
        private List<ItemTry> cartItems;

        public CartAdapter(List<ItemTry> cartItems) {
            this.cartItems = cartItems;
        }

        @NonNull
        @Override
        public CartViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_item, parent, false);
            return new CartViewHolder(itemView);
        }

        @Override
        public void onBindViewHolder(@NonNull CartViewHolder holder, int position) {
            ItemTry currentItem = cartItems.get(position);
            holder.itemName.setText("Name: " + currentItem.getName());
            holder.itemImage.setImageResource(currentItem.getImageRes());
            holder.sizeTextView.setText("Size: " + currentItem.getSize());
            holder.sugarTextView.setText("Sugar: " + currentItem.getSugar());
            holder.toppingTextView.setText("Toppings: " + currentItem.getTopping());
            holder.itemPrice.setText(" " + currentItem.getPrice());

        }

        @Override
        public int getItemCount() {
            return cartItems.size();
        }

        public static class CartViewHolder extends RecyclerView.ViewHolder {
            TextView sizeTextView, sugarTextView, toppingTextView,itemName, itemPrice;
            ImageView itemImage;

            public CartViewHolder(@NonNull View itemView) {
                super(itemView);
                itemName = itemView.findViewById(R.id.itemName);
                sizeTextView = itemView.findViewById(R.id.sizeTextView);
                sugarTextView = itemView.findViewById(R.id.sugarTextView);
                toppingTextView = itemView.findViewById(R.id.toppingTextView);
                itemImage = itemView.findViewById(R.id.itemImage);
                itemPrice=itemView.findViewById(R.id.itemPrice);
            }

        }
    }


