package com.example.will.iledc30;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class NavActivity extends AppCompatActivity {

    private LinearLayout homeLayout;
    private LinearLayout dashLayout;
    private LinearLayout settingLayout;

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    homeLayout.setVisibility(View.VISIBLE);
                    dashLayout.setVisibility(View.GONE);
                    settingLayout.setVisibility(View.GONE);
                    return true;
                case R.id.navigation_dashboard:
                    homeLayout.setVisibility(View.GONE);
                    dashLayout.setVisibility(View.VISIBLE);
                    settingLayout.setVisibility(View.GONE);
                    return true;
                case R.id.navigation_notifications:
                    homeLayout.setVisibility(View.GONE);
                    dashLayout.setVisibility(View.GONE);
                    settingLayout.setVisibility(View.VISIBLE);
                    return true;
            }
            return false;
        }

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nav);


        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);


        homeLayout = (LinearLayout)findViewById(R.id.home_layout);
        dashLayout = (LinearLayout)findViewById(R.id.dash_layout);
        settingLayout =(LinearLayout)findViewById(R.id.setting_layout);

        homeLayout.setVisibility(View.VISIBLE);
        dashLayout.setVisibility(View.GONE);
        settingLayout.setVisibility(View.GONE);
    }

}
