package com.necipvarlik.entities;

public class Ev extends Bina{

    @Override
    public String toString() {
        return super.toString();
    }

    public Ev(double price, double area, int numberOfHall, int numberOfLRoom) {
        super(price, area, numberOfHall, numberOfLRoom);
    }
}
