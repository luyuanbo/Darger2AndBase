package com.jiaxin.basemvp.mvp;

import java.lang.ref.WeakReference;

/**
 * Created by Zzw on 2017/12/18.19:52
 */

public abstract class BasePresenter<V extends BaseView> implements IbasePresenter<V> {
    private WeakReference<V> weakReference;
    protected V view;
    @Override
    public void attach(V v) {
        weakReference = new WeakReference<V>(v);
        view = weakReference.get();
    }

    @Override
    public void detach() {
        if (null != weakReference){
            weakReference.clear();
            weakReference = null;
        }
    }
}
