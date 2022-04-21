package com.example.chatz;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.chatz.databinding.ItemReceiveBinding;

public class ReceiverViewHolder extends RecyclerView.ViewHolder {

    ItemReceiveBinding binding;

    public ReceiverViewHolder(@NonNull View itemView) {
        super(itemView);
        binding = ItemReceiveBinding.bind(itemView);
    }
}
