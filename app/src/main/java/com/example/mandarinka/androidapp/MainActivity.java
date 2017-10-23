package com.example.mandarinka.androidapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public final static String EXTRA_ADDRESS = "EXTRA_ADDRESS";
    public final static String EXTRA_NAME = "EXTRA_NAME";
    public final static String EXTRA_DISTANCE = "EXTRA_DISTANCE";

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.branch_list);

        final ArrayList<BranchItem> myDataset = getDataSet();

        mRecyclerView = (RecyclerView) findViewById(R.id.branch_recycler_view);

        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        mAdapter = new RecyclerAdapter(myDataset, new RecyclerAdapter.OnItemClickListener() {

            @Override
            public void onItemClick(View v, int position) {
                Intent intent = new Intent(v.getContext(), DetailedInfoMain.class);

                BranchItem branchItem = myDataset.get(position);
                intent.putExtra(EXTRA_ADDRESS, branchItem.getAddress());
                intent.putExtra(EXTRA_NAME, branchItem.getName());
                intent.putExtra(EXTRA_DISTANCE, branchItem.getDistance());

                startActivity(intent);
            }
        });
        mRecyclerView.setAdapter(mAdapter);
    }

    private ArrayList<BranchItem> getDataSet() {

        ArrayList<BranchItem> mDataSet = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            String address = "Address" + new Random().nextInt(100);
            String name = "Name" + new Random().nextInt(100);
            String distanse = new Random().nextInt(10) + "км";
            mDataSet.add(new BranchItem(address, name, distanse));
        }
        return mDataSet;
    }

    public void clickDistance(View v) {
        System.out.println("clickDistance");
    }

    public void clickPhone(View v) {
        System.out.println(" clickPhone");
    }
}