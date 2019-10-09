package com.example.homework1_2material.moxy;

import android.util.Log;

import com.example.homework1_2material.moxy.model.SecondModel;
import com.example.homework1_2material.view.SecondView;

import moxy.InjectViewState;
import moxy.MvpPresenter;

@InjectViewState
public class SecondPresenter extends MvpPresenter<SecondView> {

    private static final String TAG = "SecondPresenter";

    private SecondModel model;

    public SecondPresenter() {
        Log.d(TAG, "SecondPresenter: ");
        this.model = new SecondModel();
    }

    private int calcX(int x){
        return x * 2;
    }

    public void onButtonClick(){
        int oldX = model.getX();
        int newX = calcX(oldX);
        model.setX(newX);
        getViewState().setButtonText(newX);
    }

}