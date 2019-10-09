package com.example.projectmaterial.model;

import java.util.ArrayList;
import java.util.List;

public class Data {

    List<String> list;

    public Data() {
        list = new ArrayList<>();
        list.add("Клубника");
        list.add("Малина");

    }

    public List<String> getList() {
        return list;
    }
}

