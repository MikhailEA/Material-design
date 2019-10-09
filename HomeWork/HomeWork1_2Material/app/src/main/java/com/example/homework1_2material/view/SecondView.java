package com.example.homework1_2material.view;

import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndStrategy;
import moxy.viewstate.strategy.StateStrategyType;

public interface SecondView extends MvpView {

    @StateStrategyType(value = AddToEndStrategy.class)
    void setButtonText(int x);

}

