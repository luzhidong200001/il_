package com.example.il_.Ba;

import android.view.LayoutInflater;

import java.util.IdentityHashMap;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;

public class Ba_model {
    private CompositeDisposable compositeDisposable;
    public void add(Disposable disposable){
        if (compositeDisposable==null){
            synchronized (Ba_model.class){
                if (compositeDisposable==null){
                    compositeDisposable=new CompositeDisposable();
                }
            }
        }
        compositeDisposable.add(disposable);
    }
    public void Disposable(){compositeDisposable.dispose();}
    public void rem(Disposable disposable){
        if (compositeDisposable!=null){
            compositeDisposable.remove(disposable);
        }
    }
}
