package com.example.homework1_2material.view;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.homework1_2material.R;
import com.example.homework1_2material.moxy.SecondPresenter;


import moxy.MvpAppCompatActivity;
import moxy.presenter.InjectPresenter;
import moxy.presenter.ProvidePresenter;


public class SecondActivity extends MvpAppCompatActivity implements SecondView {

    private static final String TAG = "SecondActivity";

    private Button button;

    @InjectPresenter
    SecondPresenter presenter;


    @ProvidePresenter
    public SecondPresenter providePresenter() {
        return new SecondPresenter();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.d(TAG, "onCreate: ");
        button = findViewById(R.id.button_activity_second);

    }


    public void buttonClick(View view) {
        presenter.onButtonClick();
    }

    @Override
    public void setButtonText(int x) {
        Log.d(TAG, "setButtonText: " + x);
        button.setText("Количество = " + x);
    }
}