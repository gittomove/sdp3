package com.company;

public class HouseWithBath extends HouseDecorator {

    public HouseWithBath(House house) {
        super(house);
    }

    @Override
    public String getCost() {
        return super.getCost() + " + 5000$";
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", with Bath";
    }
}
