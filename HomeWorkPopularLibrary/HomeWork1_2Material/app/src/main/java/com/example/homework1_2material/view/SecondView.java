package com.example.homework1_2material.view;

import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndStrategy;
import moxy.viewstate.strategy.SkipStrategy;
import moxy.viewstate.strategy.StateStrategyType;

public interface SecondView extends MvpView {

    @StateStrategyType(value = SkipStrategy.class)
    void setButtonText(String str);

}

