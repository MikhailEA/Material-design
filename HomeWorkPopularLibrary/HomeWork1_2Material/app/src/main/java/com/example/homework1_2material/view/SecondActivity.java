package com.example.homework1_2material.view;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.homework1_2material.R;
import com.example.homework1_2material.moxy.presenter.SecondPresenter;


import moxy.MvpAppCompatActivity;
import moxy.presenter.InjectPresenter;


public class SecondActivity extends MvpAppCompatActivity implements SecondView {

    private static final String TAG = "SecondActivity";

    private EditText editText;
    private Button button;
    private TextView textView;

    @InjectPresenter
    SecondPresenter presenter;


//    @ProvidePresenter
//    public SecondPresenter providePresenter() {
//        return new SecondPresenter();
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        editText = findViewById(R.id.editText_activity_second);
        button = findViewById(R.id.button_activity_second);
        textView = findViewById(R.id.textView_activity_second);

    }


    public void buttonClick(View view) {

        presenter.onButtonClick(editText.getText().toString());
    }

    @Override
    public void setButtonText(String str) {
        Log.d(TAG, "setButtonText: " + str);
        textView.setText(str);
    }
}