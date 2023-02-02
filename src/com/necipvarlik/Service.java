package com.necipvarlik;

import com.necipvarlik.entities.Bina;
import com.necipvarlik.entities.Ev;
import com.necipvarlik.entities.Villa;
import com.necipvarlik.entities.Yazlik;

import java.util.ArrayList;
import java.util.List;

public class Service {

    public double totalPriceOfEv(List<Ev> evList) {

       double totalPrice = 0;

        for (Ev ev: evList
             ) {
            totalPrice += ev.getPrice();
        }

        return totalPrice;
    }
    public double averageOfEvArea(List<Ev> yazlikList) {

        double totalArea = 0;

        for (Ev ev : yazlikList
             ) {
            totalArea += ev.getArea();
        }

        return (totalArea / yazlikList.size());
    }

    public double totalPriceOfYazlik(List<Yazlik> yazlikList) {

        double totalPrice = 0;

        for (Yazlik yazlik: yazlikList
        ) {
            totalPrice += yazlik.getPrice();
        }

        return totalPrice;
    }
    public double averageOfYazlikArea(List<Yazlik> yazlikList) {

        double totalArea = 0;

        for (Yazlik yazlik : yazlikList
        ) {
            totalArea += yazlik.getArea();
        }

        return (totalArea / yazlikList.size());
    }

    public double totalPriceOfVilla (List<Villa> villaList) {

        double totalPrice = 0;

        for (Villa villa: villaList
        ) {
            totalPrice += villa.getPrice();
        }

        return totalPrice;
    }
    public double averageOfVillaArea(List<Villa> villaList) {

        double totalArea = 0;

        for (Villa villa : villaList
        ) {
            totalArea += villa.getArea();
        }

        return (totalArea / villaList.size());
    }

    public  double  totalPriceofBina(List<Bina> binaList) {
        double totalPrice = 0;

        for (Bina bina: binaList
        ) {
            totalPrice += bina.getPrice();
        }

        return totalPrice;
    }

    public double averageOfBinaArea(List<Bina> binaList) {

        double totalArea = 0;

        for (Bina bina : binaList
        ) {
            totalArea += bina.getArea();
        }

        return (totalArea / binaList.size());
    }

    public List<Bina> filter(List<Bina> binaList , int numberOfOda , int numberOfSalon ) {
       List<Bina> filteredBinaList = new ArrayList<>();
        for (Bina bina : binaList
             ) {
            if(bina.getNumberOfOda() == numberOfOda && bina.getNumberOfSalon() == numberOfSalon) {
                filteredBinaList.add(bina);
            }
        }
        return filteredBinaList;
    }
}
