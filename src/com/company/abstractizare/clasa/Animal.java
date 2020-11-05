package com.company.abstractizare.clasa;

public class Animal extends Vietate {

    private double picioare;

    public Animal(String clasa, double picioare) {
        super("Animal");
        this.picioare = picioare;
    }

    public double getPicioare() {
        return picioare;
    }

    public void setPicioare(double picioare) {
        this.picioare = picioare;
    }

    @Override
    public String deplasare() {
        return ("Animalele merg");
    }

    @Override
    public String toString() {
        return super.toString() +
                "Picioare" + picioare;
    }
}
