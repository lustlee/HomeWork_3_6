package com.example.homework_6;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainAdapter2 extends RecyclerView.Adapter<MainAdapter2.MainViewHolder> {
    ArrayList<ItemModel2> list = new ArrayList<>();

    public void addText1(ArrayList<ItemModel2> data) {
        list.addAll(data);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.number_list,parent,false);
        return new MainAdapter2.MainViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, int position) {
        holder.bind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MainViewHolder extends RecyclerView.ViewHolder{
        private TextView tv_number;

        public MainViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_number = (TextView) itemView.findViewById(R.id.tv_number);
        }

        public void bind(ItemModel2 model){
            tv_number.setText(String.valueOf(model.number));
        }
    }
}
