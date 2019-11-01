package com.example.homework3.HomeWork_3_2;


import android.util.Log;

import io.reactivex.Single;
import io.reactivex.schedulers.Schedulers;

public class SinglePostsPresenter {

    private static final String TAG = "SinglePostsPresenter";

    public Single<Object> getTextOfSms() {
        Single<Object> single = Single.create(emitter -> {
            String sms = "sms";
            Log.d(TAG, "getTextOfSms: " + Thread.currentThread().getName() + ": " + sms);
            emitter.onSuccess(sms);
        }).subscribeOn(Schedulers.io());
        return single;
    }
}


