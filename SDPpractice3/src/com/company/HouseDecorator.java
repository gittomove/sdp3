package com.company;

public abstract class HouseDecorator implements House {
    protected final House decoratedHouse;

    public HouseDecorator(House house) {
        this.decoratedHouse = house;
    }

    public String getDescription() {
        return decoratedHouse.getDescription();
    }

    public String getCost(){
        return decoratedHouse.getCost();
    }


}
