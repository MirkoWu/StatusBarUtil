package com.mirkowu.statusbarutilsample;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.ColorRes;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.mirkowu.statusbarutil.StatusBarUtil;

public class LightModeActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_light_mode);
        //BaseToolbar 的 setStatusBarColor()方法 和这个方法二选一即可，不然会多出一个状态栏高度
        StatusBarUtil.setStatusBarColor(this,Color.WHITE);//设置状态栏颜色
        StatusBarUtil.setStatusBarLightMode(this);//设置亮色模式 （即statusBar文字颜色变为黑色）

        findViewById(R.id.mBtnNone).setOnClickListener(this);
        findViewById(R.id.mBtnUseSystem).setOnClickListener(this);
        findViewById(R.id.mBtnUseColor).setOnClickListener(this);
        findViewById(R.id.mBtnUseColorWithAlpha).setOnClickListener(this);
    }

    public int getColorId(@ColorRes int color) {
        return ContextCompat.getColor(this, color);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        switch (id) {
            case R.id.mBtnNone:
                StatusBarUtil.setStatusBarLightMode(this);
                break;
            case R.id.mBtnUseSystem:
                StatusBarUtil.setStatusBarLightModeWithNoSupport(this, true);
                break;
            case R.id.mBtnUseColor:
                StatusBarUtil.setStatusBarLightModeWithNoSupport(this, Color.CYAN);
                break;
            case R.id.mBtnUseColorWithAlpha:
                StatusBarUtil.setStatusBarLightModeWithNoSupport(this, Color.GRAY, 100);
                break;

        }
    }
}
