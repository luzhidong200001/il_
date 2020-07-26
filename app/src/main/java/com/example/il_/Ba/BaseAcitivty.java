package com.example.il_.Ba;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.il_.R;

import butterknife.ButterKnife;

public abstract class BaseAcitivty<P extends Ba_pre> extends AppCompatActivity implements BaseView {
    @Override
    public void onSucess(String string) {

    }
    public P p;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getlay());
        ButterKnife.bind(this);
        initpre();
        if (p!=null){
            p.bind(this);
        }
        initview();
        initdata();
    }

    protected abstract void initdata();

    protected abstract void initview();

    protected abstract void initpre();

    protected abstract int getlay();
}
