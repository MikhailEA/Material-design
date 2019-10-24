package com.example.homework5.HomeWork_5_1;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {User.class}, version = 1, exportSchema = false)
public abstract class AppDaDataBase extends RoomDatabase {
    public abstract UserDao userDao();
}
