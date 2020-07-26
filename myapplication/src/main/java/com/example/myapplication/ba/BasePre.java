package com.example.myapplication.ba;

import java.util.ArrayList;

public abstract class BasePre<V extends BaseView> {
    private V v;
    private ArrayList<Ba_model> list=new ArrayList<>();
    public void add(Ba_model a){
        list.add(a);
    }
    public BasePre (){}
    protected abstract void initPresenter();
    public void bind(V vie){
        this.v=vie;
    }
    public void ond(){
        v=null;
        for (int i=0;i<list.size();i++){
            list.get(i).isposable();
        }
    }
}
