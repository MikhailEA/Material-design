package com.example.homework7.HomeWork_7_2.presenter.presenter;

import moxy.MvpView;
import moxy.viewstate.strategy.SkipStrategy;
import moxy.viewstate.strategy.StateStrategyType;

public interface RetrofitView extends MvpView {
    @StateStrategyType(value = SkipStrategy.class)
    void showName(String name);
}
