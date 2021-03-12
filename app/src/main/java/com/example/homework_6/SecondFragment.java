package com.example.homework_6;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class SecondFragment extends Fragment {

    RecyclerView rv_namber;
    MainAdapter2 mainAdapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.second_fragment, container, false);

        rv_namber = view.findViewById(R.id.rv_number);
        mainAdapter = new MainAdapter2();
        rv_namber.setAdapter(mainAdapter);
        ArrayList<ItemModel2> list = new ArrayList<>();

        list.add(new ItemModel2(1));
        list.add(new ItemModel2(2));
        list.add(new ItemModel2(3));
        list.add(new ItemModel2(4));
        list.add(new ItemModel2(5));
        list.add(new ItemModel2(6));
        list.add(new ItemModel2(7));
        list.add(new ItemModel2(8));
        list.add(new ItemModel2(9));
        list.add(new ItemModel2(10));

        mainAdapter.addText1(list);

        return view;
    }
}