package com.company;

public class DefaultHouse implements House {
    @Override
    public String getDescription() {
        return "Default house";
    }

    @Override
    public String getCost() {
        return "10,000$";
    }
}
