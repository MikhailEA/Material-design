package com.example.homework2_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.util.concurrent.TimeUnit;

public class AsyncTaskActivity extends AppCompatActivity {

    private static final String TAG = "AsyncTaskActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_async_task);
    }

    public void onClickButton(View view) {
        MyAsyncTask myAsyncTask = new MyAsyncTask();
        myAsyncTask.execute();
        Log.d(TAG, "onClickButton: " + Thread.currentThread().getName());
    }


    private static class MyAsyncTask extends AsyncTask<Void, Void, Void> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            Log.d(TAG, "onPreExecute: " + Thread.currentThread().getName());
        }

        @Override
        protected Void doInBackground(Void... voids) {

                try {
                    for (int i = 0; i <5 ; i++) {
                    TimeUnit.SECONDS.sleep(1);
                    Log.d(TAG, "doInBackground" + Thread.currentThread().getName() + ": " + i);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } return null;
        }

        @Override
        protected void onPostExecute(Void avoid) {
            super.onPostExecute(avoid);
            Log.d(TAG, "onPostExecute: " + Thread.currentThread().getName());
        }
    }
}
