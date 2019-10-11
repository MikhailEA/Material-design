package com.example.homework2_2;

import android.util.Log;

import java.util.ArrayList;

public class Forbes implements Observarble {

    private static final String TAG = "Forbes";

    private ArrayList<Observer> arrayList;
    private String name;
    private String num;

    public Forbes() {
        arrayList = new ArrayList<>();
    }

    public void newMagazin(String name, String num) {
        this.name = name;
        this.num = num;

        notifyAllObservers();

    }

    @Override
    public void registerObserver(Observer observer) {
        Log.d(TAG, "registerObserver: ");
        arrayList.add(observer);

    }

    @Override
    public void unregisterObserver(Observer observer) {
        Log.d(TAG, "unregisterObserver: ");
        arrayList.remove(observer);

    }

    @Override
    public void notifyAllObservers() {
        Log.d(TAG, "notifyAllObserver: ");
        for (int i = 0; i <arrayList.size() ; i++) {
            Observer observer = arrayList.get(i);
            observer.updateData(name, num);
        }

    }
}
