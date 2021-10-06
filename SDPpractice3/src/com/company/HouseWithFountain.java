package com.company;

public class HouseWithFountain extends HouseDecorator {

    public HouseWithFountain(House house) {
        super(house);
    }

    @Override
    public String getCost() {
        return super.getCost() + " + 12,000$";
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", with Fountain";
    }
}
