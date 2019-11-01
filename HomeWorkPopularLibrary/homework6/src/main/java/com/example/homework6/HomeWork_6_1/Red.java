package com.example.homework6.HomeWork_6_1;

import android.util.Log;

public class Red {
    private static final String TAG = "Red";

    public Red() {
        Green green = new Green();
        Log.d(TAG, "Red: " + green.getStr());
        Log.i(TAG, "Rea: " + green);

    }
}
