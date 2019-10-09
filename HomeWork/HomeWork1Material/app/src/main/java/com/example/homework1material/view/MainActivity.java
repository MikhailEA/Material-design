package com.example.homework1material.view;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.homework1material.R;
import com.example.homework1material.presenter.MainPresenter;

public class MainActivity extends AppCompatActivity implements MainView{

    private static final String TAG = "MainActivity";

    private Button button;
    private MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: ");
        button = findViewById(R.id.button_activity_main);

        mainPresenter = new MainPresenter(this);
    }

    public void buttonClick(View view){
        mainPresenter.onButtonClick();
    }

    @SuppressLint("SetTextI18n")
    public void setButtonText(int x){

        button.setText("Количество = " + x);
    }
}
