package com.example.homework6.HomeWork_6_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.homework6.HomeWork_6_1.Green;
import com.example.homework6.HomeWork_6_1.Red;
import com.example.homework6.HomeWork_6_1.White;
import com.example.homework6.R;

public class DiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_di);

        Red red = new Red();
        Green green = new Green();
        White white = new White();
    }
}
