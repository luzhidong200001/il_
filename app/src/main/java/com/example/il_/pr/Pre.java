package com.example.il_.pr;

import com.example.il_.Ba.Ba_pre;
import com.example.il_.Bean;
import com.example.il_.call;
import com.example.il_.model.Model;
import com.example.il_.vie.Vie;

import java.util.ArrayList;

public class Pre extends Ba_pre<Vie> implements call {

    private Model model;

    @Override
    protected void initpre() {
        model = new Model();
        addmodel(model);
    }

    @Override
    public void ok(ArrayList<Bean.ListBean> beans) {
        v.onsucess(beans);
    }

    public void get() {
        model.get(this);
    }
}
