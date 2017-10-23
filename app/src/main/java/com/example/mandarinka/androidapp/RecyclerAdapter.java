package com.example.mandarinka.androidapp;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by mandarinka on 22.10.17.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {
    private BranchItem[] mDataset;

    // класс view holder-а с помощью которого мы получаем ссылку на каждый элемент
    // отдельного пункта списка
    public static class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        // наш пункт состоит только из одного TextView
        public TextView recycler_view_adress;
        public TextView recycler_view_name;
        public TextView recycler_view_distance;

        public ViewHolder(View v) {
            super(v);
            recycler_view_adress = (TextView) v.findViewById(R.id.recycler_view_adress);
            recycler_view_name = (TextView) v.findViewById(R.id.recycler_view_name);
            recycler_view_distance = (TextView) v.findViewById(R.id.recycler_view_distance);
        }

        @Override
        public void onClick(View v) {
            Intent intent = new Intent (v.getContext(), DetailedInformation.class);
        }
    }

    // Конструктор
    public RecyclerAdapter(BranchItem[] dataset) {
        mDataset = dataset;
    }

    // Создает новые views (вызывается layout manager-ом)
    @Override
    public RecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                         int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.branch_recycler_view_item, parent, false);

        // тут можно программно менять атрибуты лэйаута (size, margins, paddings и др.)
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    // Заменяет контент отдельного view (вызывается layout manager-ом)
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.recycler_view_adress.setText(mDataset[position].getAddress());
        holder.recycler_view_name.setText(mDataset[position].getName());
        holder.recycler_view_distance.setText(mDataset[position].getDistance());
    }

    // Возвращает размер данных (вызывается layout manager-ом)
    @Override
    public int getItemCount() {
        return mDataset.length;
    }
}
