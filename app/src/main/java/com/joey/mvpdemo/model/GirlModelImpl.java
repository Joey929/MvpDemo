package com.joey.mvpdemo.model;

import com.joey.mvpdemo.R;
import com.joey.mvpdemo.bean.Girl;

import java.util.ArrayList;
import java.util.List;

/**
 * describe：
 * author：WuQiuYun
 * date: 2018/8/7
 */

public class GirlModelImpl implements IGirlModel {
    @Override
    public void loadGirl(GirlOnLoadListener listener) {
        List<Girl> list = new ArrayList<>();
        list.add(new Girl("joey", "1273783793", "从明天起，关心粮食和蔬菜", R.mipmap.aaa));
        list.add(new Girl("winni", "215645145", "面朝大海春年花开", R.mipmap.bbb));
        list.add(new Girl("wendy", "45345534", "劈柴喂马", R.mipmap.ccc));
        list.add(new Girl("sony", "65785876876", "周游世界", R.mipmap.ddd));
        list.add(new Girl("pony", "433656565", " 给每一位亲人写信", R.mipmap.eee));
        list.add(new Girl("rose", "e5467576577", "告诉他们我的幸福", R.mipmap.fff));
        list.add(new Girl("joe", "36745767576", "我有一所房子", R.mipmap.ggg));
        list.add(new Girl("win", "467576878", "面朝大海春年花开", R.mipmap.hhh));
        listener.onComplete(list);
    }
}
