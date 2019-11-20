package com.huatec.edu.http;


import android.util.Log;

import com.huatec.edu.common.Constants;
import com.huatec.edu.http.entity.HttpResult;
import com.huatec.edu.http.entity.MemberEntity;
import com.huatec.edu.http.presenter.MemberPresenter;
import com.huatec.edu.http.service.CategoryService;
import com.huatec.edu.http.service.GoodsService;
import com.huatec.edu.http.service.MemberService;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

public class HttpMethods {
    private static final String TAG = "HttpMethods";

    private static final String BASE_URL = Constants.BASE_URL;
    private static final long DEFAULT_TIMBOUT = 5;
    private static HttpMethods sInstance;
    protected static GoodsService goodsService;
    protected static MemberService memberService;
    protected static CategoryService categoryService;
    private Retrofit retrofit;

    public HttpMethods(){
        if (sInstance == null){
            OkHttpClient okHttpClient = new OkHttpClient.Builder()
                    .connectTimeout(DEFAULT_TIMBOUT, TimeUnit.SECONDS)
                    .readTimeout(DEFAULT_TIMBOUT, TimeUnit.SECONDS)
                    .writeTimeout(DEFAULT_TIMBOUT, TimeUnit.SECONDS)
                    .build();
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                    .client(okHttpClient)
                    .build();

            goodsService = retrofit.create(GoodsService.class);
            memberService = retrofit.create(MemberService.class);
            categoryService = retrofit.create(CategoryService.class);
        }
    }

    public static HttpMethods getInstance(){
        if (sInstance == null){
            synchronized (HttpMethods.class){
                if (sInstance == null){
                    sInstance = new HttpMethods();
                }
            }
        }
        return sInstance;
    }

    public static class HttpResultFunc<T> implements Func1<HttpResult<T>,T>{
        @Override
        public T call(HttpResult<T> httpResult){
            Log.i(TAG,"status:"+httpResult.getStatus());
            Log.i(TAG,"msg:"+httpResult.getMsg());
            Log.i(TAG,"data:"+httpResult.getData());
            return httpResult.getData();
        }
    }

    protected static <T> void toSubscribe(Observable<T> observable, Subscriber<T> subscriber){
        observable.subscribeOn(Schedulers.io())
                .unsubscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(subscriber);
    }

    private void httpRequest(final String username, final String password){
        MemberPresenter.login2(new Subscriber<MemberEntity>(){
            @Override
            public void onCompleted(){

            }

            @Override
            public void onError(Throwable e){
                Log.e("error","e:"+e.getMessage().toString());
            }

            @Override
            public void onNext(MemberEntity memberEntity){

            }
        },username,password);
    }


}
