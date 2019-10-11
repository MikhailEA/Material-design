package com.example.homework2_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class ObserverActivity extends AppCompatActivity {

    private Forbes forbes = new Forbes();
    private Iam iam = new Iam();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_observer);
    }

    public void register(View view) {
        forbes.registerObserver(iam);
    }

    public void unregister(View view) {
        forbes.unregisterObserver(iam);
    }

    public void mailing(View view) {
        forbes.notifyAllObservers();
    }


}
