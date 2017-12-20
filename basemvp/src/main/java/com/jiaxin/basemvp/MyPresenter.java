package com.jiaxin.basemvp;

import com.jiaxin.basemvp.mvp.BasePresenter;

import javax.inject.Inject;

/**
 * Created by Zzw on 2017/12/18.20:22
 */

public class MyPresenter extends BasePresenter<MyView> {

    @Inject
    public MyPresenter() {
    }

    public void getData(){
        view.showLoading();
        String ans = "成功";



        view.hideLoading();
        view.dataOver(ans);
    }
}
