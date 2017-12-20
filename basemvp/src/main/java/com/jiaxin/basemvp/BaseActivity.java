package com.jiaxin.basemvp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Created by Zzw on 2017/12/18.19:42
 */

public abstract class BaseActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getlayout());
        Log.d("mylog", "Base onCreate: " + this.getClass().getSimpleName());

        initView();
        initData();
    }

    protected abstract void initData();

    protected void initView(){

    }

    protected abstract int getlayout() ;
}
