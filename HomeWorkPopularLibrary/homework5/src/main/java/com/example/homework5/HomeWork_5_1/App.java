package com.example.homework5.HomeWork_5_1;

import android.app.Application;

import androidx.room.Room;

public class App extends Application {

    private static AppDaDataBase appDatabase;

    @Override
    public void onCreate() {
        super.onCreate();

        appDatabase = Room.databaseBuilder(getApplicationContext(),
                AppDaDataBase.class, "room2310_database" ).build();
    }

    public static AppDaDataBase getAppDatabase() { return appDatabase; }
}
