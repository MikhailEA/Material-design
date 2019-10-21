package com.example.homework4.HomeWork_4_2;

import android.util.Log;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;

public class RetrofitPresenter {

    private static final String TAG = "RetrofitDifPresenter";

    private RetrofitApi retrofitApi;

    public RetrofitPresenter() {
        retrofitApi = new RetrofitApi();
    }

    public void getString() {
        Observable<String> single = retrofitApi.requestServer();

        Disposable disposable = single.observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer<String>() {
            @Override
            public void accept(String str) throws Exception {
                Log.d(TAG, "onNext: " + str);
            }
        }, throwable -> {
            Log.e(TAG, "onError");
        });
    }
}
