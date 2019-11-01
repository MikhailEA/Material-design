package com.example.homework6.HomeWork_6_2;

import android.util.Log;

public class Red {
    private static final String TAG = "Red";
    private Green green;

    public Red(Green green) {
        this.green = green;
        Log.d(TAG, "Red: " + green.getStr());
        Log.i(TAG, "Rea: " + green);

    }
}
