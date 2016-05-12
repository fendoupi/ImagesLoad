package com.recycleview.cn.recycleviewlearn;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.display.RoundedBitmapDisplayer;

/**
 * Created by yuan on 2016/5/12.
 */
public class ImageLoaderAdapter extends RecyclerView.Adapter<MyViewHolder> {
    private String datas[];
    private String imgs[];
    private Activity activity;
    private ImageLoader imageLoader;
    private DisplayImageOptions options;

    public ImageLoaderAdapter(String[] datas, String[] imgs, Activity activity) {
        this.datas = datas;
        this.imgs = imgs;
        this.activity = activity;
        options = new DisplayImageOptions.Builder()
                .showImageOnLoading(R.drawable.ic_stub) // 设置图片下载期间显示的图片
                .showImageForEmptyUri(R.drawable.ic_empty) // 设置图片Uri为空或是错误的时候显示的图片
                .showImageOnFail(R.drawable.ic_error) // 设置图片加载或解码过程中发生错误显示的图片
                .cacheInMemory(true) // 设置下载的图片是否缓存在内存中
                .cacheOnDisk(true) // 设置下载的图片是否缓存在SD卡中
                .displayer(new RoundedBitmapDisplayer(20)) // 设置成圆角图片
                .build(); // 构建完成
    }

    @Override

    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

            LayoutInflater inflater  = LayoutInflater.from(parent.getContext());
            View convertView =inflater.inflate(R.layout.item, parent, false);
            MyViewHolder viewHolder = new MyViewHolder(convertView);


            return viewHolder;
        }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Myapplication.initImageLoader(activity);
        imageLoader = ImageLoader.getInstance();
        imageLoader.displayImage(imgs[position], holder.imageView_01, options);
        holder.textView_01.setText(datas[position]); // TextView设置文本
    }

    @Override
    public int getItemCount() {
        return datas.length;
    }
}
