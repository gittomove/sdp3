package com.company;

public class HouseWithGarden extends HouseDecorator {

    public HouseWithGarden(House house) {
        super(house);
    }

    @Override
    public String getCost() {
        return super.getCost() + " + 7000$";
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", with Garden";
    }
}
