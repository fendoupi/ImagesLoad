package com.recycleview.cn.recycleviewlearn;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    public static final String[] images = new String[] {
            "http://upload.morningpost.com.cn/2016/0424/1461500562798.jpg",
            "http://n1.itc.cn/img8/wb/recom/2016/05/10/146281428987787562.JPEG",
            "http://www.heimaba.com/uploads/allimg/160419/232913B30_0.jpg",
            "http://www.52tq.net/uploads/allimg/160325/1339122J5-1.jpg",
            "http://www.jstv.com/n/ws/kn/kn2013/mxzr/pic5/201212/W020121218577067906207.jpg",
            "http://a4.att.hudong.com/35/84/01300000234985122043846480800.jpg",
            "http://pic29.nipic.com/20130523/8576182_152829623156_2.jpg",
            "http://img.pconline.com.cn/images/upload/upc/tx/itbbs/1107/10/c3/8285934_1310296207010_1024x1024it.jpg",
            "http://img.pconline.com.cn/images/upload/upc/tx/itbbs/1302/18/c3/18198747_1361160256657_1024x1024it.jpg",
            "http://img3.redocn.com/20120504/Redocn_2012050405015798.jpg",};
    /*int img[] = {R.drawable.p1,R.drawable.p2,R.drawable.p3,R.drawable.p4,R.drawable.p5,R.drawable.p6,R.drawable.p7,R.drawable.p8,R.drawable.p9,R.drawable.p10,};*/
    String data[] = {"他今年农历四月四号刚满二十二","刚甩开课本要离开家看看这世界","却发现许多烦恼要面对","oh yeah",
            "他常会想望能回到那年他一十二","只需要好好上学生活单纯没忧愁","他一直满怀希望","人生偶尔会走上一条陌路","像是没有指标的地图","只有你知道什么是你的幸福"};
    RecyclerView recyclerView;
    RecyclerView.Adapter myadapter;
    RecyclerView.Adapter myAdapterTwo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView)findViewById(R.id.recyclerview_01);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
       /* myadapter = new Myadapter(data,images);*/
        myAdapterTwo = new ImageLoaderAdapter(data,images,MainActivity.this);
        recyclerView.setAdapter(myAdapterTwo);

    }
}
