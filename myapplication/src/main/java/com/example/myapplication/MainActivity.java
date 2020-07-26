package com.example.myapplication;



import android.os.Bundle;
import android.view.View;

import com.example.myapplication.Vie.vie;
import com.example.myapplication.ba.BaseActivity;
import com.example.myapplication.pre.Pre;

public class MainActivity extends BaseActivity<Pre> implements vie {


    @Override
    protected void initdata() {
p.get();
    }

    @Override
    protected void initvie() {

    }

    @Override
    protected void initpresneter() {
p=new Pre();
    }

    @Override
    protected int getlayout() {
        return R.layout.activity_main;
    }
}
