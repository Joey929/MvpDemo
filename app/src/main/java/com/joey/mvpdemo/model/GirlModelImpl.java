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
        list.add(new Girl("joey", "1273783793", "这是一盒每年的数据库和打开第三方", R.mipmap.aaa));
        list.add(new Girl("winni", "215645145", "阿让更多人隔一天 郭德纲", R.mipmap.bbb));
        list.add(new Girl("wendy", "45345534", "谁敢说他的但如果不", R.mipmap.ccc));
        list.add(new Girl("sony", "65785876876", "是肉兔羊肉一二姨太 儿童", R.mipmap.ddd));
        list.add(new Girl("pony", "433656565", " 尔特让他二姨太更坦然", R.mipmap.eee));
        list.add(new Girl("rose", "e5467576577", "为同一天隔一天德国人特", R.mipmap.fff));
        list.add(new Girl("joe", "36745767576", "我二姨接口就他意突然剩", R.mipmap.ggg));
        list.add(new Girl("win", "467576878", "拖后腿入口上机题惹急", R.mipmap.hhh));
        listener.onComplete(list);
    }
}
