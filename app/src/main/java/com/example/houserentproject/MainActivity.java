package com.example.houserentproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    List<HomePageData> myHomePageDataList;
    HomePageData mhomePageData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();

        setContentView(R.layout.activity_main);

        mRecyclerView = (RecyclerView)findViewById(R.id.recyclerViewId);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(MainActivity.this,1);
        mRecyclerView.setLayoutManager(gridLayoutManager);

        myHomePageDataList = new ArrayList<>();

        mhomePageData = new HomePageData("10000 BDT", "Maijdee",R.drawable.image1);
        myHomePageDataList.add(mhomePageData);

        mhomePageData = new HomePageData("11000 BDT", "Sonapur",R.drawable.image2);
        myHomePageDataList.add(mhomePageData);

        mhomePageData = new HomePageData("9000 BDT", "Banglabazar",R.drawable.image3);
        myHomePageDataList.add(mhomePageData);

        mhomePageData = new HomePageData("9500 BDT", "Maijdee Bazar",R.drawable.image4);
        myHomePageDataList.add(mhomePageData);

        MyAdapter myAdapter = new MyAdapter(MainActivity.this, myHomePageDataList);
        mRecyclerView.setAdapter(myAdapter);
    }
}