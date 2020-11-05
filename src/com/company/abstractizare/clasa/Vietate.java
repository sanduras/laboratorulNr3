package com.company.abstractizare.clasa;

public abstract class Vietate {

    private String clasa;

    public Vietate(String clasa) {
        this.clasa = clasa;
    }

    public String getClasa() {
        return clasa;
    }

    public void setClasa(String clasa) {
        this.clasa = clasa;
    }

    public abstract String deplasare();

    @Override
    public String toString() {
        return super.toString();
    }
}
