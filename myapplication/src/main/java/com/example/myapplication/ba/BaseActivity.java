package com.example.myapplication.ba;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

import butterknife.ButterKnife;

public abstract class BaseActivity<P extends BasePre> extends AppCompatActivity implements BaseView {
    @Override
    public void on(String string) {

    }
    public P p;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getlayout());
        ButterKnife.bind(this);
        initpresneter();
        if (p!=null){
            p.bind(this);
        }
        initvie();
        initdata();
    }

    protected abstract void initdata();

    protected abstract void initvie();

    protected abstract void initpresneter();

    protected abstract int getlayout();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (p!=null){
            p.ond();
            p=null
;        }
    }
}
