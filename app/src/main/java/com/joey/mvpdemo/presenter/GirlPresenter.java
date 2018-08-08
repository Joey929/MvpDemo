package com.joey.mvpdemo.presenter;

import com.joey.mvpdemo.bean.Girl;
import com.joey.mvpdemo.model.GirlModelImpl;
import com.joey.mvpdemo.model.IGirlModel;
import com.joey.mvpdemo.view.IGirlView;

import java.lang.ref.WeakReference;
import java.util.List;

/**
 * describe：表示层
 * author：WuQiuYun
 * date: 2018/8/7
 */

public class GirlPresenter<T extends IGirlView> extends BasePresenter<T> {

    // 2.model层的引用
    private IGirlModel iGirlModel = new GirlModelImpl();

    // 3.构造方法
    public GirlPresenter() {
    }

//    // 3.构造方法
//    public GirlPresenter(T view) {
//        mViewRef = new WeakReference<T>(view);
//    }

    // 4.执行操作(UI逻辑)
    public void fetch() {
        if (mViewRef.get() != null) {
            mViewRef.get().showLoading();
            if (iGirlModel != null) {
                iGirlModel.loadGirl(new IGirlModel.GirlOnLoadListener() {
                    @Override
                    public void onComplete(List<Girl> girls) {
                        if ((mViewRef.get() != null)) {
                            mViewRef.get().showGirls(girls);
                        }
                    }
                });
            }
        }
    }


}
