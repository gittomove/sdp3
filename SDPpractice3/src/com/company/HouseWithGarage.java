package com.company;

public class HouseWithGarage extends HouseDecorator {

    public HouseWithGarage(House house) {
        super(house);
    }

    @Override
    public String getCost(){
        return super.getCost() + " + 10,000$";
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Garage";
    }
}
