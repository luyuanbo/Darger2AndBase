package com.vip.darger2andbase;

import com.vip.darger2andbase.base.BasePersenter;

import javax.inject.Inject;

/**
 * Created by 卢总 on 2017/12/20.
 */

public class MyPersenter extends BasePersenter<MyView> {

    @Inject
    public MyPersenter() {

    }

    public void getdata(){
        view.showLoding();
        String nn="成功";

        view.hideLoding();
        view.dataOver(nn);
    }
}
