package com.example.homework1material.presenter;

import android.util.Log;

import com.example.homework1material.model.Model;
import com.example.homework1material.view.MainView;

public class MainPresenter {

    private static final String TAG = "MainPresenter";

    private Model model;
    private MainView mainView;

    public MainPresenter(MainView mainView) {
        Log.d(TAG, "MainPresenter: ");
        this.mainView = mainView;
        model = new Model();
    }

    private int calcX(int x) { return x ; }

    public void onButtonClick() {
        int oldX = model.getX();
        int newX = calcX(oldX);
        model.setX(newX);
        mainView.setButtonText(newX);
    }
}
