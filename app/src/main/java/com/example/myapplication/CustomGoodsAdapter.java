package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomGoodsAdapter extends BaseAdapter {
    Context  ctx;
    int layoutItem;
    ArrayList<Goods> arrayList;

    public CustomGoodsAdapter(Context ctx, int layoutItem, ArrayList<Goods> arrayList) {
        this.ctx = ctx;
        this.layoutItem = layoutItem;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = LayoutInflater.from(ctx).
                inflate(layoutItem,viewGroup,false);
        TextView tvName = view.findViewById(R.id.textView);
        TextView tvShop = view.findViewById(R.id.textView2);
        ImageView img = view.findViewById(R.id.imageView);

        tvName.setText(arrayList.get(i).getName());
        tvName.setText(arrayList.get(i).getShopName());
        img.setImageResource(arrayList.get(i).getImageGoods());

        return view;
    }
}
