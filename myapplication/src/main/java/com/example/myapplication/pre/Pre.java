package com.example.myapplication.pre;

import com.example.myapplication.Vie.vie;
import com.example.myapplication.ba.BasePre;
import com.example.myapplication.back;
import com.example.myapplication.model.Model;

public class Pre extends BasePre<vie> implements back {

    private Model model;

    @Override
    protected void initPresenter() {
        model = new Model();
        add(model);
    }

    public void get() {

    }
}
