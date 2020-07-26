package com.example.il_.Ba;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import butterknife.ButterKnife;

public abstract class BaseFragment<P extends Ba_pre> extends Fragment implements BaseView {

//    private View inflate;

    @Override
    public void onSucess(String string) {

    }

    public P pre;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View inflate = inflater.inflate(get(), null);
        ButterKnife.bind(this,inflate);
        initpre();
        if (pre!=null){
            pre.bind(this);
        }
        initview();
        initdata();
        return inflate;
    }

    protected abstract void initdata();

    protected abstract void initview();

    protected abstract void initpre();

    protected abstract int get();
}
