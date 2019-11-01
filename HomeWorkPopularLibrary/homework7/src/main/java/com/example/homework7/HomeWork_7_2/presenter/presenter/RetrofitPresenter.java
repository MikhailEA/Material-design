package com.example.homework7.HomeWork_7_2.presenter.presenter;

import android.util.Log;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;

public class RetrofitPresenter {

    private static final String TAG = "RetrofitDifPresenter";

    private RetrofitApi retrofitApi;

    public RetrofitPresenter() {
        retrofitApi = new RetrofitApi();
    }

    public void getString() {
        Observable<String> single = retrofitApi.requestServer();


    }


}
