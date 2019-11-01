package com.example.homework3.HomeWork_3_3;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.homework2_3.R;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;

public class PostsActivity extends AppCompatActivity {

    private static final String TAG = "SinglePostsActivity";

    private Observable<String> observable;
    private Disposable disposable;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_posts);

        textView = findViewById(R.id.text_view_activity_posts);

        PostsPresenter postsPresenter = new PostsPresenter();
        observable = postsPresenter.getTextOfSms();
    }

    public void subscribe2(View view) {

        observable.observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<String>() {

            @Override
            public void onSubscribe(Disposable disposable) {
                Log.d(TAG, "onScribe: ");
                PostsActivity.this.disposable = disposable;
            }

            @Override
            public void onNext(String str) {
                Log.d(TAG, "onNext: " + Thread.currentThread().getName() + ": " + str);
                textView.setText(str);
            }

            @Override
            public void onError(Throwable e) {
                Log.e(TAG, "onError: " + e);
            }

            @Override
            public void onComplete() {
                Log.d(TAG, "onComplete: ");
            }
        });
        Log.d(TAG, "subscribe: end " + Thread.currentThread().getName());
    }

    public void unsubscribe(View view) {
        disposable.dispose();
    }

}
