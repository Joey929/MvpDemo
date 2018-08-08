package com.joey.mvpdemo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.joey.mvpdemo.R;
import com.joey.mvpdemo.bean.Girl;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * describe：
 * author：WuQiuYun
 * date: 2018/8/7
 */

public class GirlAdapter extends BaseAdapter {
    private Context context;
    private List<Girl> list;

    public GirlAdapter(Context context,List<Girl> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Girl getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder;
        if (view == null) {
            viewHolder = new ViewHolder();
            view = LayoutInflater.from(context).inflate(R.layout.item_girl_list, null);
            viewHolder.tvDescribe=view.findViewById(R.id.tv_describe);
            viewHolder.tvName=view.findViewById(R.id.tv_name);
            viewHolder.tvPhone=view.findViewById(R.id.tv_phone);
            viewHolder.ivPic=view.findViewById(R.id.iv_pic);
            view.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) view.getTag();
        }

        Girl girl = getItem(i);
        viewHolder.tvName.setText(girl.getName());
        viewHolder.tvPhone.setText(girl.getPhone());
        viewHolder.tvDescribe.setText(girl.getDescribe());
        Picasso.with(context).load(girl.getDrawable()).into(viewHolder.ivPic);
        return view;
    }

    private class ViewHolder {
        private ImageView ivPic;
        private TextView tvName;
        private TextView tvPhone;
        private TextView tvDescribe;
    }
}
