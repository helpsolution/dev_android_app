package com.example.mandarinka.androidapp;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;


public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    private ArrayList<BranchItem> mDataset;
    private OnItemClickListener mItemClickListener;

    public interface OnItemClickListener {
        void onItemClick(View view, int position);
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public TextView recycler_view_adress;
        public TextView recycler_view_name;
        public TextView recycler_view_distance;

        public ViewHolder(View v) {
            super(v);
            recycler_view_adress = (TextView) v.findViewById(R.id.recycler_view_adress);
            recycler_view_name = (TextView) v.findViewById(R.id.recycler_view_name);
            recycler_view_distance = (TextView) v.findViewById(R.id.recycler_view_distance);

            v.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            mItemClickListener.onItemClick(v, getAdapterPosition()); //OnItemClickListener mItemClickListener;
        }
    }

    public RecyclerAdapter(ArrayList<BranchItem> dataset, OnItemClickListener onItemClickListener) {
        mDataset = dataset;
        mItemClickListener = onItemClickListener;
    }

    @Override
    public RecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.branch_recycler_view_item, parent, false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.recycler_view_adress.setText(mDataset.get(position).getAddress());
        holder.recycler_view_name.setText(mDataset.get(position).getName());
        holder.recycler_view_distance.setText(mDataset.get(position).getDistance());
    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }
}
