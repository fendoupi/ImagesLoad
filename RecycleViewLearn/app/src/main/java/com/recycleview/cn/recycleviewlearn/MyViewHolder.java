package com.recycleview.cn.recycleviewlearn;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by yuan on 2016/4/22.
 */
public class MyViewHolder extends RecyclerView.ViewHolder {
    public TextView textView_01;
    public ImageView imageView_01;
    public MyViewHolder(View itemView) {
        super(itemView);
        textView_01 = (TextView)itemView.findViewById(R.id.tv_01);
        imageView_01 = (ImageView)itemView.findViewById(R.id.img_01);
    }
}

