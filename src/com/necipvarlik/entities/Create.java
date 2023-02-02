package com.necipvarlik.entities;

import java.util.ArrayList;
import java.util.List;

public class Create {

    public List<Ev> getEvList() {

        Ev ev1 = new Ev(150_000,200.0,1,3);
        Ev ev2 = new Ev(400_000,550.0,2,5);
        Ev ev3 = new Ev(250_000,250.0,1,4);

        List<Ev> evList = new ArrayList<>();

        evList.add(ev1);
        evList.add(ev2);
        evList.add(ev3);

        return evList;
    }

    public List<Yazlik> getYazlikList() {

        Yazlik yazlik1 = new Yazlik(600_000 , 150 , 1 , 2);
        Yazlik yazlik2 = new Yazlik(900_000 , 250 , 2 , 5);
        Yazlik yazlik3 = new Yazlik(750_000 , 200 , 2 , 3);

        List<Yazlik> yazlikList = new ArrayList<>();

        yazlikList.add(yazlik1);
        yazlikList.add(yazlik2);
        yazlikList.add(yazlik3);

        return yazlikList;
    }

    public List<Villa> getVillaList() {

        Villa villa1 = new Villa(1_500_000 , 400 , 2 , 6);
        Villa villa2 = new Villa(2_000_000 , 500 , 2 , 8);
        Villa villa3 = new Villa(2_500_000 , 600 , 3 , 10);

        List<Villa> villaList = new ArrayList<>();

        villaList.add(villa1);
        villaList.add(villa2);
        villaList.add(villa3);

        return villaList;
    }
}
