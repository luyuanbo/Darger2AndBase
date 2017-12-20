package com.vip.darger2andbase.base;

import java.lang.ref.WeakReference;

/**
 * Created by 卢总 on 2017/12/20.
 */

public abstract class BasePersenter <V extends BaseView> implements IBasePersenter<V>{


    private WeakReference<V> vWeakReference;
    protected V view;

    @Override
    public void attach(V v) {
        vWeakReference = new WeakReference<>(v);
        view =vWeakReference.get();
    }

    @Override
    public void dettach() {

        if (null!=vWeakReference){
            vWeakReference.clear();
            vWeakReference=null;
        }
    }
}
