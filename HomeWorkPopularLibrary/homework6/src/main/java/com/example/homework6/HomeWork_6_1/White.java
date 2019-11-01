package com.example.homework6.HomeWork_6_1;

import android.util.Log;

public class White {
    private static final String TAG = "White";

    public White() {
        Green green = new Green();
        Log.d(TAG, "White: " + green.getStr());
        Log.i(TAG, "White: " + green);

    }
}
