package com.jiaxin.basemvp;

import android.util.Log;
import android.widget.Toast;

import com.jiaxin.basemvp.mvp.BaseMvpActivity;

public class MainActivity extends BaseMvpActivity<MyPresenter> implements MyView{

    private String TAG = "mylog";
    @Override
    public void showLoading() {
        Log.d(TAG, "showLoading: 显示加载动画");
    }

    @Override
    public void hideLoading() {
        Log.d(TAG, "hideLoading: 隐藏加载动画");
    }

    @Override
    public void dataOver(String msg) {
        Toast.makeText(this, "接收到数据:" + msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void initData() {
        presenter.getData();
    }


    @Override
    protected int getlayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void inject() {
        getComponent().inject(this);
    }
}
