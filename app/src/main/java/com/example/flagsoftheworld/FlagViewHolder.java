package com.example.flagsoftheworld;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class FlagViewHolder extends RecyclerView.ViewHolder {
    private ImageView flagImage;
    private TextView country;
    private Flag flag;

    public FlagViewHolder(View root){
        super(root);
        flagImage=root.findViewById(R.id.flagImage);
        country=root.findViewById(R.id.countryTitle);
    }
    public void bindFlag(Flag f){
        flag=f;
        flagImage.setImageResource(flag.getFlagResource());
        country.setText(flag.getCountryName());
    }
}
