package com.example.homework3.HomeWork_3_1;

import android.util.Log;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.schedulers.Schedulers;


public class PostsPresenter {

    private static final String TAG = "PostsPresenter";

    public io.reactivex.Observable<String> getTextOfSms() {

        Observable<String> observable = Observable.create((ObservableOnSubscribe<String>) emitter -> {
            try {
            for (int i = 0; i < 10 ; i++) {
                TimeUnit.SECONDS.sleep(1);
                String sms = "sms: " + i;
                Log.d(TAG, "getTextOfSms: " + Thread.currentThread().getName() + ": " + sms);
                emitter.onNext(sms);
            }
            //emitter.onError(new NullPointerException());
            emitter.onNext("sms: 10");
            emitter.onComplete();
        } catch (InterruptedException e) {
            Log.d(TAG, "getTextOfSms: not disposed");
        }
    }).subscribeOn(Schedulers.io());
        return observable;
    }

}
