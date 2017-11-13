package com.example.mandarinka.androidapp.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.example.mandarinka.androidapp.R;
import com.example.mandarinka.androidapp.fragment.BranchItemFragment;

public class MainActivity extends FragmentActivity {

    private FragmentManager manager;

    private FragmentTransaction transaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_activity_main );

        manager = getSupportFragmentManager();
        initFragmentList();


    }

    private void initFragmentList() {
        transaction = manager.beginTransaction();
        for (int i = 0; i < 11; i++) {
            transaction.add(R.id.fragment_branch_list_container, new BranchItemFragment());
        }
        transaction.commit();
    }

}