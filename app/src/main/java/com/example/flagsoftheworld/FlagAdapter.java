package com.example.flagsoftheworld;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FlagAdapter extends RecyclerView.Adapter<FlagViewHolder> {
    private ArrayList<Flag> flags;
    public FlagAdapter(ArrayList<Flag> f){
        flags=f;
    }

    @NonNull
    @Override
    public FlagViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View root=layoutInflater.inflate(R.layout.list_item,parent,false);
        FlagViewHolder flagViewHolder=new FlagViewHolder(root);
        return flagViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull FlagViewHolder holder, int position) {
        Flag current=flags.get(position);
        holder.bindFlag(current);
    }

    @Override
    public int getItemCount() {
        return flags.size();
    }
}
