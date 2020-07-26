package com.example.myapplication.ba;

import android.webkit.WebView;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;

public class Ba_model {
    private CompositeDisposable compositeDisposable;
    public void add(Disposable m){
        if (compositeDisposable==null){
            synchronized (this){
                if (compositeDisposable==null){
                    compositeDisposable=new CompositeDisposable();
                }
            }
        }
        compositeDisposable.add(m);
    }
    public void isposable(){compositeDisposable.dispose();}
    public void rem(Disposable disposable){
        if (compositeDisposable!=null){
            compositeDisposable.remove(disposable);
        }
    }
}
