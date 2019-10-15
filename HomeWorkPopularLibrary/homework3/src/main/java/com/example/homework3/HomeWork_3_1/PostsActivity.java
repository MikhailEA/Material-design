package com.example.homework3.HomeWork_3_1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.homework2_3.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;

public class PostsActivity extends AppCompatActivity {

    private static final String TAG = "PostsActivity";



    private Observable<String> observable;
    private Disposable disposable;
    @BindView(R.id.text_view_activity_posts)
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_posts);

        ButterKnife.bind(this);


        PostsPresenter postsPresenter = new PostsPresenter();
        observable = postsPresenter.getTextOfSms();
    }

    public void subscribe(View view) {
        disposable = observable.observeOn(AndroidSchedulers.mainThread()).subscribe(string -> {
            Log.d(TAG, "onNext: " + string);
        }, throwable -> {
            Log.e(TAG, "onError");
        }, () -> {
            Log.d(TAG, "onComplete: ");
        });
    }

    public void unsubscribe(View view) {
        disposable.dispose();
    }
}
