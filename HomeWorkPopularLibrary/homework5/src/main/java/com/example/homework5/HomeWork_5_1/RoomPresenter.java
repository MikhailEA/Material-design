package com.example.homework5.HomeWork_5_1;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;



class RoomPresenter {

    private static final String TAG = "RoomPresenter";
    private UserDao userDao;
    public RoomPresenter() { userDao = App.getAppDatabase().userDao(); }

    public void putData() {
        User user = new User();
        user.id = 1;

        Disposable disposable = userDao.insert(user).subscribeOn(Schedulers.io()).
                observeOn(AndroidSchedulers.mainThread())
                .subscribe(id -> {
                    Log.d(TAG, "putData: " + id);
                }, throwable -> {
                    Log.d(TAG, "putData: " + throwable);
                });
    }

    public void putListData() {
        User user1 = new User();
        user1.id = 1;
        User user2 = new User();
        user2.id = 2;

        List<User> list = new ArrayList<>();
        list.add(user1);
        list.add(user2);
    }

    public void getData() {
        Disposable disposable = userDao.getAll ().subscribeOn (Schedulers.io ()).
                observeOn (AndroidSchedulers.mainThread ())
                .subscribe(users -> {
                    Log.d(TAG, "getData: " + users);
                }, throwable -> {
                    Log.d(TAG, "getData: " + throwable);
                });
    }

    public void deleteData() {
        User user = new User();
        user.id = 1;
        Disposable disposable = userDao.delete(user).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribe(id -> {
                    Log.d(TAG, "deleteData: " + id);
                }, throwable -> {
                    Log.d(TAG, "deleteData: " + throwable);
                });
    }
}
