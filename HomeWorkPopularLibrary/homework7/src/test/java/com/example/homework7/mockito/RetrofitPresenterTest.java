package com.example.homework7.mockito;


import com.example.homework7.HomeWork_7_2.presenter.presenter.RetrofitPresenter;
import com.example.homework7.HomeWork_7_2.presenter.presenter.RetrofitView;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.concurrent.Callable;

import io.reactivex.Scheduler;
import io.reactivex.android.plugins.RxAndroidPlugins;
import io.reactivex.functions.Function;

@RunWith(MockitoJUnitRunner.class)
public class RetrofitPresenterTest {

    private RetrofitPresenter postsPresenter;

    @Mock
    RetrofitView retrofitView;

    @BeforeClass
    public static void setupClass() {
        RxAndroidPlugins.setInitMainThreadSchedulerHandler(new Function<Callable<Scheduler>, Scheduler>() {
            @Override
            public Scheduler apply(Callable<Scheduler> schedulerCallable) throws Exception {
                return null;
            }
        });
    }

    @Before
    public void before() {
        MockitoAnnotations.initMocks(this);
        postsPresenter = Mockito.spy(new RetrofitPresenter());
    }

    @Test
    public void getString_isCorrect() {

    }


}
