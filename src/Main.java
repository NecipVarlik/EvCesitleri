import com.necipvarlik.Service;
import com.necipvarlik.entities.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Service service = new Service();

        Create createList = new Create();

        List<Ev> evList = createList.getEvList();
        List<Yazlik> yazlikList = createList.getYazlikList();
        List<Villa> villaList = createList.getVillaList();

        List<Bina> binaList = new ArrayList<>();
        binaList.addAll(evList);
        binaList.addAll(yazlikList);
        binaList.addAll(villaList);

        for (Bina bina: binaList
             ) {
            System.out.println(bina.toString());
        }

        System.out.printf("Evlerin toplam fiyatı:%.2f TL \n", service.totalPriceOfEv(evList));
        System.out.printf("Yazlıkların toplam fiyatı:%.2f TL \n", service.totalPriceOfYazlik(yazlikList));
        System.out.printf("Villaların toplam fiyatı:%.2f TL \n", service.totalPriceOfVilla(villaList));
        System.out.printf("Bütün binaların toplam fiyatı:%.2f TL \n", service.totalPriceofBina(binaList));

        System.out.printf("Evlerin ortalama alanı: %.2f metrekare \n", service.averageOfEvArea(evList));
        System.out.printf("Yazlıkların ortalama alanı: %.2f metrekare \n", service.averageOfYazlikArea(yazlikList));
        System.out.printf("Evlerin ortalama alanı: %.2f metrekare \n", service.averageOfVillaArea(villaList));
        System.out.printf("Binaların ortalama alanı: %.2f metrekare \n", service.averageOfBinaArea(binaList));


        System.out.print("Oda sayısı: ");
        int oda = input.nextInt();
        System.out.print("Salon sayısı: ");
        int salon = input.nextInt();

        List<Bina> filteredList = service.filter(binaList,oda,salon);

        for (Bina bina:filteredList)
              {
                  System.out.printf("%s: %s \n",bina.getClass().getSimpleName(),bina.toString());
        }

    }
}