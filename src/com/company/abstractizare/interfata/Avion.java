package com.company.abstractizare.interfata;

public class Avion implements Colet {
    private  double viteza;
    private  double distanta;
    private  double timp = 0.0D;
    private  double timpClimateric;

    public Avion(double viteza, double distanta, double timpClimateric) {
        this.viteza = viteza;
        this.distanta = distanta;
        this.timpClimateric = timpClimateric;
    }

    @Override
    public double trasportRapid() {
        return timp = distanta / viteza;
    }

    @Override
    public double transportIndelungat() {
        return timp = distanta / viteza + timpClimateric;
    }

    @Override
    public String toString() {
        return "Avion{" +
                "viteza=" + viteza +
                ", distanta=" + distanta +
                ", timp=" + timp +
                ", timpClimateric=" + timpClimateric +
                '}';
    }
}
