package com.example.homework6.HomeWork_6_3.app;

import android.app.Application;
import android.content.Context;

import com.example.homework6.HomeWork_6_3.Green;
import com.example.homework6.HomeWork_6_3.Red;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {
    private final Application application;

    public AppModule(Application application) {
        this.application = application;
    }

    @Singleton
    @Provides
    Green provideGreen(Red red) {
        return new Green(application.getApplicationContext(), red, new String("asd") );
    }

    @Singleton
    @Provides
    Red provideRed() {
        return new Red();
    }

    @Singleton
    @Provides
    Context provideContext() {
        return application.getApplicationContext();
    }
}
