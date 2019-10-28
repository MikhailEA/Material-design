package com.example.homework6.HomeWork_6_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.homework6.R;

public class NoDiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no_di);

        Red red = new Red();
        Green green = new Green();
        White white = new White();
    }
}
