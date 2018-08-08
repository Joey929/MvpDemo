package com.joey.mvpdemo.model;

import com.joey.mvpdemo.bean.Girl;

import java.util.List;

/**
 * describe：用来加载数据
 * author：WuQiuYun
 * date: 2018/8/7
 */

public interface IGirlModel {
    void loadGirl(GirlOnLoadListener listener);

    // 设计一个内部回调接口
    interface GirlOnLoadListener {
        void onComplete(List<Girl> girls);
    }
}
