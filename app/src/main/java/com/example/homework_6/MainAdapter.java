package com.example.homework_6;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MainViewHolder2> {
    ArrayList<ItemModel> list = new ArrayList<>();

    public void addText(ArrayList<ItemModel> data){
        list.addAll(data);
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MainViewHolder2 onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.names_list,parent,false);
        return new MainViewHolder2(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder2 holder, int position) {
        holder.bind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MainViewHolder2 extends RecyclerView.ViewHolder{
        private TextView tv_name;
        private TextView tv_name1;
        public MainViewHolder2(@NonNull View itemView) {
            super(itemView);
            tv_name = (TextView) itemView.findViewById(R.id.tv_name);
            tv_name1 = (TextView) itemView.findViewById(R.id.tv_name2);
        }

        public void bind(ItemModel model){
            tv_name.setText(String.valueOf(model.name));
            tv_name1.setText(String.valueOf(model.name1));
        }
    }
}

