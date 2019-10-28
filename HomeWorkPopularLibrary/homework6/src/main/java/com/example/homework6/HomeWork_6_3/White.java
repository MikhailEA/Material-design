package com.example.homework6.HomeWork_6_3;

import android.util.Log;

import androidx.appcompat.widget.ThemedSpinnerAdapter;

import com.example.homework6.HomeWork_6_3.app.App;

import javax.inject.Inject;

public class White {
    private static final String TAG = "White";
    @Inject
    Green green;



    public White() {
        App.getAppComponent().inject(this);
        Log.d(TAG, "White: " + green.getStr());
        Log.i(TAG, "White: " + green);

        //Log.d(TAG, "White: " + helper.getNum);

    }
}
