package com.example.homework7.HomeWork_7_2.presenter.presenter;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.homework7.R;

import butterknife.ButterKnife;
import butterknife.OnClick;


public class RetrofitActivity extends AppCompatActivity {

    private static final String TAG = "RetrofitDifActivity";

    private RetrofitPresenter retrofitPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retrofit);
        ButterKnife.bind(this);

        retrofitPresenter = new RetrofitPresenter();
    }

    @OnClick(R.id.button_activity_retrofit)
    public void onClickButton(View view) {
        Log.d(TAG, "onClickButton: ");
        retrofitPresenter.getString();
    }
}
