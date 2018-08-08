package com.joey.mvpdemo;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import com.joey.mvpdemo.adapter.GirlAdapter;
import com.joey.mvpdemo.bean.Girl;
import com.joey.mvpdemo.presenter.BasePresenter;
import com.joey.mvpdemo.presenter.GirlPresenter;
import com.joey.mvpdemo.view.IGirlView;

import java.util.List;

public class MainActivity extends BaseActivity<IGirlView,GirlPresenter<IGirlView>> implements IGirlView {
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.lv_girl);
        girlPresenter.fetch();
    }

    @Override
    protected GirlPresenter<IGirlView> creatPresenter() {
        return new GirlPresenter<>();
    }

    @Override
    public void showLoading() {
        Toast.makeText(MainActivity.this, "加载成功", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showGirls(List<Girl> girls) {
        GirlAdapter girlAdapter = new GirlAdapter(MainActivity.this, girls);
        listView.setAdapter(girlAdapter);
        girlAdapter.notifyDataSetChanged();
    }
}
