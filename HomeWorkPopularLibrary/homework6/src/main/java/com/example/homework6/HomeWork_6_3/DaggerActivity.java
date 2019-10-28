package com.example.homework6.HomeWork_6_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.homework6.HomeWork_6_3.app.App;
import com.example.homework6.R;

import javax.inject.Inject;

public class DaggerActivity extends AppCompatActivity {

    private static final String TAG = "DaggerActivity";
    @Inject
    Green green;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dagger);

        App.getAppComponent().inject(this);

        White white = new White();
        Red red = new Red();

        Log.d(TAG, "onCreate: " + green.getStr());
        Log.i(TAG, "onCreate: " + green);


    }
}
