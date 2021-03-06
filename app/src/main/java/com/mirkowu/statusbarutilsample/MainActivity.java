package com.mirkowu.statusbarutilsample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.mirkowu.statusbarutil.StatusBarUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DrawerLayout mDrawerLayout = findViewById(R.id.mDrawerLayout);
        StatusBarUtil.setTransparentForDrawerLayout(this,mDrawerLayout);

    }

    public void onClick(View view) {
        startActivity(new Intent(this,LightModeActivity.class));
    }
}
