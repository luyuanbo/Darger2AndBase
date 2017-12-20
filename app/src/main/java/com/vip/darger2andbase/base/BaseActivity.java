package com.vip.darger2andbase.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Created by 卢总 on 2017/12/20.
 */

public abstract class BaseActivity extends AppCompatActivity {

    private static final String TAG = "mylog";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getlayout());
        Log.d(TAG, "Base onCreate: "+this.getClass().getSimpleName());
        initView();
        initData();
    }

    protected abstract int getlayout();

    protected void initView(){}
    protected void initData(){}
}
