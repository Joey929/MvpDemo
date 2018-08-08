package com.joey.mvpdemo.presenter;

import java.lang.ref.WeakReference;

/**
 * describe：
 * author：WuQiuYun
 * date: 2018/8/7
 */

public class BasePresenter<T> {
    // 1.view 层的引用
    //    private IGirlView girlView;
    protected WeakReference<T> mViewRef;

    // 进行绑定
    public void attachView(T view) {
        mViewRef = new WeakReference<T>(view);
    }

    // 进行解绑
    public void detachView() {
        mViewRef.clear();
    }
}
