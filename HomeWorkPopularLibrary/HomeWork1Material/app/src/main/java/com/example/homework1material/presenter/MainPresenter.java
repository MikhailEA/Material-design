package com.example.homework1material.presenter;

import android.util.Log;

import com.example.homework1material.model.Model;
import com.example.homework1material.view.MainView;

public class MainPresenter {

    private static final String TAG = "MainPresenter";

    private Model model;
    private MainView mainView;

    public MainPresenter(MainView mainView) {
        //Log.d(TAG, "MainPresenter: ");
        this.mainView = mainView;
        model = new Model();
    }

    private String appendStr(String oldStr, String str) {
        return oldStr + str;
    }

    public void onButtonClick(String str) {
        String oldStr = model.getStr();
        String newStr = appendStr(oldStr, str);
        model.setStr(newStr);
        mainView.setButtonText(newStr);
    }
}
