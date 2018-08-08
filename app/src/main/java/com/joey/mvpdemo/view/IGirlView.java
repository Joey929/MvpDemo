package com.joey.mvpdemo.view;

import com.joey.mvpdemo.bean.Girl;

import java.util.List;

/**
 * describe：
 * author：WuQiuYun
 * date: 2018/8/7
 */

public interface IGirlView {
    void showLoading();

    void showGirls(List<Girl> girls);

}
