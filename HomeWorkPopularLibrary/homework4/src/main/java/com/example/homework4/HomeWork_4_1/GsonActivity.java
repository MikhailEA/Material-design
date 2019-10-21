package com.example.homework4.HomeWork_4_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.homework4.R;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import butterknife.OnClick;

public class GsonActivity extends AppCompatActivity {

    private static final String TAG = "GsonActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gson);

        String json = "\"time_of_year\": \"summer\" + \"year\": 2019 ";

        Gson gson = new GsonBuilder().create();
        DateOf data = gson.fromJson(json, DateOf.class);

        Log.d(TAG, "onCreate: " + data.time_of_year);
        Log.d(TAG, "onCreate" + data.year);
    }

    @OnClick(R.id.button_activity_gson)
    public void onClickButton(View view) {
        Log.d(TAG, "onClickButton: ");
    }
}
