package com.example.il_;

import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.example.il_.Ba.BaseAcitivty;
import com.example.il_.pr.Pre;
import com.example.il_.vie.Vie;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseAcitivty<Pre> implements Vie {

    @BindView(R.id.too)
    Toolbar too;
    @BindView(R.id.t)
    TabLayout t;
    @BindView(R.id.v)
    ViewPager v;
    @BindView(R.id.li)
    LinearLayout li;
    @BindView(R.id.lin)
    DrawerLayout lin;

    @Override
    protected void initdata() {
        p.get();
    }

    @Override
    protected void initview() {
        ArrayList<Fragment> fragments = new ArrayList<>();
        GataFragment gataFragment = new GataFragment();
        fragments.add(gataFragment);
        fragment fragment = new fragment();
        fragments.add(fragment);
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("item");
        arrayList.add("item1");
        ada ada = new ada(getSupportFragmentManager(), fragments, arrayList);
        v.setAdapter(ada);
        t.setupWithViewPager(v);
        t.getTabAt(0).setIcon(R.drawable.a);
    }

    @Override
    protected void initpre() {
        p=new Pre();
    }

    @Override
    protected int getlay() {
        return R.layout.activity_main;
    }

    @Override
    public void onsucess(ArrayList<Bean.ListBean> arrayList) {

    }
}
