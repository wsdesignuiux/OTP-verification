package com.example.a.otp;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import adapter.ViewAdapter;
import me.relex.circleindicator.CircleIndicator;

public class MainActivity extends AppCompatActivity  {
    ViewPager viewPager;
    CircleIndicator circleIndicator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        circleIndicator = findViewById(R.id.indicator);
        viewPager = findViewById(R.id.vpager);

        ViewAdapter viewAdapter = new ViewAdapter(getSupportFragmentManager(),2);
        viewPager.setAdapter(viewAdapter);
        circleIndicator.setViewPager(viewPager);
    }


}
