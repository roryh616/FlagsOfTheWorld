package com.example.flagsoftheworld;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class ListFragment extends Fragment {

    private RecyclerView recyclerView;
    private FlagAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root=inflater.inflate(R.layout.fragment_list, container, false);
        recyclerView=(RecyclerView)root.findViewById(R.id.recycler);
        LinearLayoutManager layoutManager=new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        ArrayList<Flag> flags=new ArrayList<>();
        flags.add(new Flag(R.drawable.kazakhstan,"Kazakhstan"));
        flags.add(new Flag(R.drawable.southafrica,"South Africa"));
        flags.add(new Flag(R.drawable.qatar,"Qatar"));
        adapter=new FlagAdapter(flags);
        recyclerView.setAdapter(adapter);
        return root;
    }

}
