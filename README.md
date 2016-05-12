# ImagesLoad

这是一个关于图片加载的简单例子

采用RecyclerView+cardview的形式经行展现

**提供两种方式加载图片**

一种是正常的传递本地文件drawable中的图片进行显示 适配器为myAdapter

另一种是根据网络URL显示图片，采用的是universal-image-loader的框架 适配器为ImageLoaderAdapter

前两种适配器均是在RecyclerView.Adapter的基础上进行封装

另外还写了一个MyBaseAdapter 继承自 BaseAdapter 用于listView等控件的适配
