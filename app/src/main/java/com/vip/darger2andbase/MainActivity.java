package com.vip.darger2andbase;

import android.util.Log;
import android.widget.Toast;

import com.vip.darger2andbase.base.BaseMvpActivity;

public class MainActivity extends BaseMvpActivity<MyPersenter> implements MyView{

    private String TAG = "mylog";

    @Override
    public void showLoding() {
        Log.d(TAG, "showLoading: 显示加载动画");

    }

    @Override
    public void hideLoding() {

        Log.d(TAG, "hideLoading: 隐藏加载动画");
    }

    @Override
    protected void initData() {
        presenter.getdata();
    }

    @Override
    protected int getlayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void inject() {
        getComponent().inject(this);

    }

    @Override
    public void dataOver(String mag) {

        Toast.makeText(this, "接收到数据:" + mag, Toast.LENGTH_SHORT).show();
    }
}
