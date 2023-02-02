package com.necipvarlik.entities;

public abstract class Bina {
    private double price;

    private double area;

    private int numberOfSalon;
    private int numberOfOda;

    @Override
    public String toString() {
        return "fiyat = " + price +
                ", alan =" + area +
                ", salon sayısı = " + numberOfSalon +
                ", oda sayısı = " + numberOfOda +
                '}';
    }

    public Bina(double price, double area, int numberOfSalon, int numberOfLRoom) {
        this.price = price;
        this.area = area;
        this.numberOfSalon = numberOfSalon;
        this.numberOfOda = numberOfLRoom;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getNumberOfSalon() {
        return numberOfSalon;
    }

    public void setNumberOfSalon(int numberOfSalon) {
        this.numberOfSalon = numberOfSalon;
    }

    public int getNumberOfOda() {
        return numberOfOda;
    }

    public void setNumberOfOda(int numberOfOda) {
        this.numberOfOda = numberOfOda;
    }
}
