package com.recycleview.cn.recycleviewlearn;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.display.RoundedBitmapDisplayer;

/**
 * Created by yuan on 2016/5/12.
 */
public class MyBaseAdapter extends BaseAdapter {
    private String datas[];
    private String imgs[];
    private Activity activity;
    private ImageLoader imageLoader;
    private DisplayImageOptions options;
    public MyBaseAdapter( String datas[],String imgs[],Activity activity) {
        this.activity = activity;
        this.datas = datas;
        this.imgs = imgs;
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
    public int getCount() {
        return imgs.length;
    }

    @Override
    public Object getItem(int position) {
        return imgs[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        MyViewHolder viewHolder = null;
        if (convertView == null) {
            LayoutInflater inflater  = LayoutInflater.from(parent.getContext());
            convertView =inflater.inflate(R.layout.item, parent, false);
            viewHolder = new MyViewHolder(convertView);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (MyViewHolder) convertView.getTag();
        }

        /**
         * imageUrl 图片的Url地址 imageView 承载图片的ImageView控件 options
         * DisplayImageOptions配置文件
         */
        ;
        Myapplication.initImageLoader(activity);
        imageLoader = ImageLoader.getInstance();
        imageLoader.displayImage(imgs[position], viewHolder.imageView_01, options);
        viewHolder.textView_01.setText("Item " + (position + 1)); // TextView设置文本

        return convertView;
    }
}
