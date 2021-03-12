package com.example.homework_6;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class FirstFragment extends Fragment {
    RecyclerView rv;
    MainAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.first_fragment, container, false);

        rv = view.findViewById(R.id.rv_name);
        adapter = new MainAdapter();
        rv.setAdapter(adapter);




        ArrayList<ItemModel> list = new ArrayList<>();
        list.add(new ItemModel("Колобок","Колобокович"));
        list.add(new ItemModel("Кардашьян","Индра"));
        list.add(new ItemModel("ТипаКоллега","ЧинаНеКрыса"));
        list.add(new ItemModel("Третий","Ииииииии"));
        list.add(new ItemModel("ЯтебеГоворю","Плюхи"));
        list.add(new ItemModel("Шакарап","Странствующий"));
        adapter.addText(list);

        return view;
    }
}