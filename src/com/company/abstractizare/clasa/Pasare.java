package com.company.abstractizare.clasa;

public class Pasare extends Vietate {

    private String migratie;

    public Pasare(String clasa, String migratie) {
        super("Pasare");
        this.migratie = migratie;
    }

    public String getMigratie() {
        return migratie;
    }

    public void setMigratie(String migratie) {
        this.migratie = migratie;
    }

    @Override
    public String deplasare() {
        return ("Pasarea zboara");
    }

    @Override
    public String toString() {
        return super.toString() +
                "Migratie" + migratie;
    }
}
