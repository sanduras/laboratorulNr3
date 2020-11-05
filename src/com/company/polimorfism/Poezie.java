package com.company.polimorfism;

public class Poezie extends Carte {

    private String ilustratii;
    private int nrPoezii;

    public Poezie(String autor, int nrPagini, int anul, String titlu, String categorie, String ilustratii, int nrPoezii) {
        super(autor, nrPagini, anul, titlu, "Poezie");
        this.ilustratii = ilustratii;
        this.nrPoezii = nrPoezii;
    }
    public String getIlustratii() {
        return ilustratii;
    }

    public int getNrPoezii() {
        return nrPoezii;
    }

    public void setIlustratii(String ilustratii) {
        this.ilustratii = ilustratii;
    }

    public void setNrPoezii(int nrPoezii) {
        this.nrPoezii = nrPoezii;
    }

    @Override
    public String descriere() {
        return ("Cartea data face parte din categoria " + getCategorie() +
                ", este o frumoasa capodobera scrisa de " + getAutor() + "\n" +
                "Cartea impresioneaza prin ilustratiile ce descriu " + this.ilustratii +
                ", scrisa in versuri avind " + this.nrPoezii +
                " poezii");
    }

    @Override
    public  String tipul(){
        return "Poezia este in varianta tiparita";
    }

    @Override
    public String toString() {
        return super.toString() +  '\'' +
                ", ilustratii='" + ilustratii + '\'' +
                ", nrPoezii=" + nrPoezii;

    }

}
