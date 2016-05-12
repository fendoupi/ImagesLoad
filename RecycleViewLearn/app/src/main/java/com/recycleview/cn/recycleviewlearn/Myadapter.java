package com.recycleview.cn.recycleviewlearn;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by yuan on 2016/4/22.
 * 两个适配器父类不一样
 * 传递图片类型不一样
 * */

public class Myadapter extends RecyclerView.Adapter<MyViewHolder> {
    private String[] datas;
    private int[] img;
    //接收数据
    public Myadapter(String[] datas,int[] img) {
        this.datas = datas;
        this.img = img;
    }
    //将XMl转化为VIew 将其填充到ViewHolder里面
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        /*
        * 1. public View inflate(int resource, ViewGroup root)
        * 2. public View inflate(int resource, ViewGroup root, boolean attachToRoot)
        * 使用第二种方法
        *1.resource 布局的资源id
        * 2.root 填充的根视图
        * 3.attachToRoot 是否将载入的视图绑定到根视图中
        * */
        LayoutInflater inflater  = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item, parent, false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }
    //获取数据
    @Override
    public int getItemCount() {
        return datas.length;
    }
    //将数据与页面绑定
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.textView_01.setText(datas[position]);
        holder.imageView_01.setImageResource(img[position]);
    }


}
