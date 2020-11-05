package com.company;

import com.company.abstractizare.clasa.Animal;
import com.company.abstractizare.clasa.Pasare;
import com.company.abstractizare.clasa.Peste;
import com.company.abstractizare.clasa.Vietate;
import com.company.abstractizare.interfata.Automobil;
import com.company.abstractizare.interfata.Avion;
import com.company.polimorfism.Carte;
import com.company.polimorfism.Drame;
import com.company.polimorfism.Poezie;
import com.company.polimorfism.Roman;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Roman emma = new Roman(
                "Liviu Rebreanu",
                120,
                1998,
                "Emma",
                "Roman",
                5,
                "arhaic"
        );

        emma.setAutor("Jane Austen");
        emma.setCategorie("Roman de dragoste");

        System.out.println("--------------------------------------------------");

        Poezie poetul = new Poezie(
                "Mihai Eminescu",
                60,
                1983,
                "Taina care ma apara",
                "Romanta",
                "Peisajele naturii",
                43
        );

        poetul.setAutor("Grigorie Vieru");
        poetul.setCategorie("Poezie");

        System.out.println("--------------------------------------------------");

        Drame hotul = new Drame(
                "Markus Zusak",
                462,
                1939,
                "Hotul de carti",
                "drama",
                "omor",
                "a celui 2 razboi mondial"
        );

        Drame absentii = new Drame(
                "Augustin Buzura",
                280,
                2010,
                "Absentii",
                "drama",
                "violenta",
                "a perioada feudalismului"
        );

        System.out.println("--------------------------------------------------");

        List<Carte> Carti = new ArrayList<>();
        Carti.add(emma);
        Carti.add(poetul);
        Carti.add(hotul);
        Carti.add(absentii);

        for (Carte c : Carti) {
            System.out.println(c);
        }

        for (Carte c : Carti) {
            System.out.println(c.descriere());
        }

        for (Carte c : Carti) {
            System.out.println(c.tipul());
        }

        System.out.println("--------------------------------------------------");

        Pasare cocor = new Pasare("Pasre","Su-India");
        Animal tigru = new Animal("Animal",4);
        Peste somon = new Peste("Peste",0.8);
        Pasare ciocarlie = new Pasare("Pasare","Sud-Moldova");

        List<Vietate> vietates = new ArrayList<>();
        vietates.add(cocor);
        vietates.add(tigru);
        vietates.add(somon);
        vietates.add(ciocarlie);

        for(Vietate v : vietates) {
            System.out.println(v);
        }

        for(Vietate v : vietates) {
            System.out.println(v.deplasare());
        }

        System.out.println("--------------------------------------------------");

        Automobil car = new Automobil(120D,1975.2D,1.3D);
        Avion boing = new Avion(826D,1975.2D,6.5D);

        System.out.println(car.trasportRapid());
        System.out.println(car.transportIndelungat());

        System.out.println(boing.trasportRapid());
        System.out.println(boing.transportIndelungat());

    }

}
