package com.example.chatz;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.chatz.databinding.ItemSentBinding;

public class SentViewHolder extends RecyclerView.ViewHolder {

    ItemSentBinding binding;

    public SentViewHolder(@NonNull View itemView) {
        super(itemView);
        binding = ItemSentBinding.bind(itemView);
    }
}
