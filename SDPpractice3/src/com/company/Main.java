package com.company;


public class Main {

    public static void info(House house){
        System.out.println("Description: " + house.getDescription() + ";\n Cost " + house.getCost());
    }


    public static void main(String[] args) {
        House house = new DefaultHouse();
        info(house);

        house = new HouseWithBath(house);
        info(house);

        house = new HouseWithGarage(house);
        info(house);

        house = new HouseWithFountain(house);
        info(house);
    }
}
