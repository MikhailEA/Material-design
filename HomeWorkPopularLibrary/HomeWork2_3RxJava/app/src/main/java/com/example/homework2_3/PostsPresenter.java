package com.example.homework2_3;

import android.util.Log;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.schedulers.Schedulers;

public class PostsPresenter {

    private static final String TAG = "PostsPresenter";

    public Observable<String> getTextOfSms() {

        Observable<String> observable = Observable.create(new ObservableOnSubscribe<String>() {
            @Override
            public void subscribe(ObservableEmitter<String> emitter) throws Exception {
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
        }
    }).subscribeOn(Schedulers.io());
        //.subscribeOn(Schedulers.io())
        return observable;
    }

}
