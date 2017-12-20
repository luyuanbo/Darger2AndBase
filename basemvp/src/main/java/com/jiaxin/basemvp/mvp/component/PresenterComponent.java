package com.jiaxin.basemvp.mvp.component;

import com.jiaxin.basemvp.MainActivity;

import dagger.Component;

/**
 * Created by Zzw on 2017/12/18.20:03
 */

@Component
public interface PresenterComponent {
    void inject(MainActivity activity);
}
