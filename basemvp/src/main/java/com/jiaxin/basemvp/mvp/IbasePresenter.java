package com.jiaxin.basemvp.mvp;

/**
 * Created by Zzw on 2017/12/18.19:50
 */

public interface IbasePresenter<V extends BaseView> {
    void attach(V v);
    void detach();
}
