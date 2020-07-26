package com.example.il_;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface Api {
    String a="http://yun918.cn/";
    @POST("live/xsxcjfsj.json")
    Observable<Bean> get();
}
