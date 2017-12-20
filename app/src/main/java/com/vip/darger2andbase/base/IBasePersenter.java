package com.vip.darger2andbase.base;

/**
 * Created by 卢总 on 2017/12/20.
 */

public interface IBasePersenter<V extends BaseView> {

    void attach(V v);
    void dettach();
}
