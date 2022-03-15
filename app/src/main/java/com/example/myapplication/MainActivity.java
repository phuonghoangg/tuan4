package com.example.myapplication;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.ListView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvGood;
    CustomGoodsAdapter adt;
    ArrayList<Goods> arrayList;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvGood = findViewById(R.id.lvGood);

        arrayList = new ArrayList<>();
        arrayList.add(new Goods("Ca nau mimi,...","shop devan",R.drawable.ca_nau_lau));
        arrayList.add(new Goods("1KG bo toi","shop LTD food",R.drawable.ga_bo_toi));
        arrayList.add(new Goods("Xe can cau","the gioi do choi",R.drawable.do_choi_dang_mo_hinh));
        arrayList.add(new Goods("Lanh dao don gian","Minh Long book",R.drawable.lanh_dao_gian_don));
        adt = new CustomGoodsAdapter(this,R.layout.item_listview,arrayList);
        lvGood.setAdapter(adt);
    }
}
