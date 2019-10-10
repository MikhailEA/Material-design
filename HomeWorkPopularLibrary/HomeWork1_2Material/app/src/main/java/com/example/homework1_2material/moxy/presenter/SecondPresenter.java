package com.example.homework1_2material.moxy.presenter;

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

    private String appendStr(String oldStr, String str){
        return oldStr + str;
    }

    public void onButtonClick(String str){
        String oldStr = model.getStr();
        String newStr = appendStr(oldStr, str);
        model.setStr(newStr);
        getViewState().setButtonText(newStr);
    }

}