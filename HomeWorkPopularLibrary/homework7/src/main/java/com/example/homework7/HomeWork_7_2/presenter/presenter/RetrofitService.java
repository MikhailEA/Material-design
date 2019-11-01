package com.example.homework7.HomeWork_7_2.presenter.presenter;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface RetrofitService {
	@GET("/users/JakeWharton")
    Observable<String> getUser();

	@GET("/users/pereudin")
    Observable<String> getUser1();

}
