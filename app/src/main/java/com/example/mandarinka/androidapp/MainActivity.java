package com.example.mandarinka.androidapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.branch_list);

        BranchItem[] myDataset = getDataSet();

        mRecyclerView = (RecyclerView) findViewById(R.id.branch_recycler_view);

        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        mAdapter = new RecyclerAdapter(myDataset);
        mRecyclerView.setAdapter(mAdapter);
    }

    private BranchItem[] getDataSet() {

        BranchItem[] mDataSet = new BranchItem[11];
        for (int i = 0; i < mDataSet.length; i++) {
            String address = "addres" + new Random().nextInt(100);
            String name = "name" + new Random().nextInt(100);
            String distanse = new Random().nextInt(10) + "км";
            mDataSet[i] = new BranchItem(address, name, distanse);
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