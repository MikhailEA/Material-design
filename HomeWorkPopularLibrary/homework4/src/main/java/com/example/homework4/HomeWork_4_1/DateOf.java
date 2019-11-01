package com.example.homework4.HomeWork_4_1;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DateOf {
    @Expose
    @SerializedName("time_of_year")
    public String time_of_year;

    @Expose
    @SerializedName("year")
    public String year;
}
