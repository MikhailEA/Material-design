package com.example.homework3.HomeWork_3_2;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.homework2_3.R;

import butterknife.ButterKnife;
import butterknife.OnClick;
import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;

public class SinglePostsActivity extends AppCompatActivity {

    private static final String TAG = "SinglePostsActivity";

    private Single<Object> single;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_posts_single);

        ButterKnife.bind(this);

        SinglePostsPresenter singlePostsPresenter = new SinglePostsPresenter();
        single = singlePostsPresenter.getTextOfSms();
    }

    @SuppressLint("SetTextI18n")
    @OnClick(R.id.subscribe1)
    public void onClickButton(View view) {
        Disposable disposable = single.observeOn(AndroidSchedulers.mainThread()).subscribe(string -> {
            Log.d(TAG, "subscribe1: " + string);
        }, throwable -> {
            Log.e(TAG, "subscribe1: ", throwable);
        });
    }
}
