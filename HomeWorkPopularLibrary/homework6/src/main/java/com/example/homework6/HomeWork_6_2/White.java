package com.example.homework6.HomeWork_6_2;

import android.util.Log;

public class White {
    private static final String TAG = "White";
    private Green green;

    public White(Green  green) {
        this.green = green;
        Log.d(TAG, "White: " + green.getStr());
        Log.i(TAG, "White: " + green);

    }
}
