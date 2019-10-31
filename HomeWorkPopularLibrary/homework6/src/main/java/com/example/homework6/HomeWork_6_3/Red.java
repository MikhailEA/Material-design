package com.example.homework6.HomeWork_6_3;

import android.content.Context;
import android.util.Log;

import com.example.homework6.HomeWork_6_3.app.App;

import javax.inject.Inject;

public class Red {
    private static final String TAG = "Red";
   @Inject
   Green green;
   @Inject
   Context appContext;

    public Red() {
        App.getAppComponent().inject(this);
        Log.d(TAG, "Red: " + green.getStr());
        Log.i(TAG, "Rea: " + green);

    }
}
