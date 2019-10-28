package com.example.homework6.HomeWork_6_3.app;

import com.example.homework6.HomeWork_6_3.DaggerActivity;
import com.example.homework6.HomeWork_6_3.Red;
import com.example.homework6.HomeWork_6_3.White;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {
    void inject(DaggerActivity daggerActivity);

    void inject(Red red);
    void inject(White white);

}
