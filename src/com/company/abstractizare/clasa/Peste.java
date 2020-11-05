package com.company.abstractizare.clasa;

public class Peste extends Vietate {

    private double marime;

    public Peste(String clasa, double marime) {
        super(clasa);
        this.marime = marime;
    }

    public double getMarime() {
        return marime;
    }

    public void setMarime(double marime) {
        this.marime = marime;
    }

    @Override
    public String deplasare() {
        return ("Pestele inoata");
    }

    @Override
    public String toString() {
        return super.toString() +
                "Marime" + marime;
    }
}
