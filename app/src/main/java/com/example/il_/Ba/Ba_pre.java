package com.example.il_.Ba;

import java.util.ArrayList;

public abstract class Ba_pre<V extends BaseView> {
    public V v;
    public ArrayList<Ba_model> arrayList=new ArrayList<>();
    public void addmodel(Ba_model model){
        arrayList.add(model);
    }
    public void bind(V vie){
        this.v=vie;
    }
    public Ba_pre (){initpre();}

    protected abstract void initpre();
    public void ond(){
        v=null;
        for (int a=0;a<arrayList.size();a++){
            arrayList.get(a).Disposable();
        }
    }

}
