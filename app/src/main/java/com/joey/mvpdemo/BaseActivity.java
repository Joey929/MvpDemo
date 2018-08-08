package com.joey.mvpdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.joey.mvpdemo.presenter.BasePresenter;

/**
 * describe：
 * author：WuQiuYun
 * date: 2018/8/7
 */

public abstract class BaseActivity<V, T extends BasePresenter<V>> extends AppCompatActivity {
    //表示层的引用
    public T girlPresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        girlPresenter = creatPresenter();
        girlPresenter.attachView((V) this);
    }

    protected abstract T creatPresenter();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        girlPresenter.detachView();
    }
}
