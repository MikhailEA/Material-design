package com.example.homework1material.view;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.homework1material.R;
import com.example.homework1material.presenter.MainPresenter;

public class MainActivity extends AppCompatActivity implements MainView{

    private static final String TAG = "MainActivity";

    private EditText editText;
    private Button button;
    private TextView textView;
    private MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainPresenter = new MainPresenter(this);

        editText = findViewById(R.id.editText_activity_main);
        button = findViewById(R.id.button_activity_main);
        textView = findViewById(R.id.textView_activity_main);
    }

    public void buttonClick(View view){
        mainPresenter.onButtonClick(editText.getText().toString());
    }

    @SuppressLint("SetTextI18n")
    public void setButtonText(String str){
        Log.d(TAG, "setButtonText: " + str);
        textView.setText(str);
    }
}
