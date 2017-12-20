package com.vip.darger2andbase.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

import com.vip.darger2andbase.base.component.DaggerPresenterComponent;
import com.vip.darger2andbase.base.component.PresenterComponent;

import javax.inject.Inject;

/**
 * Created by Zzw on 2017/12/18.19:57
 */

public abstract class BaseMvpActivity<P extends BasePersenter> extends BaseActivity implements BaseView{

    private String TAG = "mylog";
    @Inject
    protected P presenter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        inject();
        presenter.attach(this);
        Log.d(TAG, "onCreate: " + this.getClass().getSimpleName());
        super.onCreate(savedInstanceState);
    }

    protected abstract void inject();


    protected PresenterComponent getComponent(){
        return DaggerPresenterComponent.builder()
                .build();
    }

    @Override
    protected void onDestroy() {
        if (null != presenter)presenter.dettach();
        super.onDestroy();
    }
}
