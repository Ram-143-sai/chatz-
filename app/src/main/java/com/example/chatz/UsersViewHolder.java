package com.example.chatz;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.chatz.databinding.RowConversationBinding;

public class UsersViewHolder extends RecyclerView.ViewHolder {

    RowConversationBinding binding;

    public UsersViewHolder(@NonNull View itemView) {
        super(itemView);
        binding = RowConversationBinding.bind(itemView);
    }
}
