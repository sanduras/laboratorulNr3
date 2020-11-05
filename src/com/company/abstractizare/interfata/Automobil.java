package com.company.abstractizare.interfata;

public class Automobil implements Colet {

    private  double viteza;
    private  double distanta;
    private  double timp = 0.0D;
    private  double timpAmbuteiaj;

    public Automobil(double viteza, double distanta, double timpAmbuteiaj) {
        this.viteza = viteza;
        this.distanta = distanta;

        this.timpAmbuteiaj = timpAmbuteiaj;
    }

    @Override
    public double trasportRapid() {
      return timp = distanta / viteza;
    }

    @Override
    public double transportIndelungat() {
      return timp = distanta / viteza + timpAmbuteiaj;
    }

    @Override
    public String toString() {
        return "Automobil{" +
                "viteza=" + viteza +
                ", distanta=" + distanta +
                ", timp=" + timp +
                ", timpAmbuteiaj=" + timpAmbuteiaj +
                '}';
    }
}
