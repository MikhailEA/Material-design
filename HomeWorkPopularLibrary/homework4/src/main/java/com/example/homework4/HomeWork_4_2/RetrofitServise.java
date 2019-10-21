package com.example.homework4.HomeWork_4_2;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface RetrofitServise {
    @GET("/users/JakeWharton")
    Observable<String> getUser();
}
