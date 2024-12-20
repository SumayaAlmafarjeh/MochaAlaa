/*package com.example.mochaalaa.Activity.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mochaalaa.R;

import java.util.List;

public class PopularAdapter extends RecyclerView.Adapter<PopularAdapter.PopularViewHolder> {
    private List<PopularItem> popularItems;

    public PopularAdapter(List<PopularItem> popularItems) {
        this.popularItems = popularItems;
    }

    @NonNull
    @Override
    public PopularViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.popular_item, parent, false);
        return new PopularViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PopularViewHolder holder, int position) {
        PopularItem item = popularItems.get(position);
        holder.imageView.setImageResource(item.getImageResId());
        holder.nameTextView.setText(item.getName());
        holder.priceTextView.setText(item.getPrice());
    }

    @Override
    public int getItemCount() {
        return popularItems.size();
    }

    public static class PopularViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView nameTextView;
        TextView priceTextView;

        public PopularViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.popular_item_image);
            nameTextView = itemView.findViewById(R.id.popular_item_name);
            priceTextView = itemView.findViewById(R.id.popular_item_price);
        }
    }
}
*/