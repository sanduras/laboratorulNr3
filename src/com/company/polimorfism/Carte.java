package com.company.polimorfism;

public class Carte {

    private String autor;
    private int nrPagini;
    private int anul;
    private String titlu;
    private String categorie;

    public Carte(String autor, int nrPagini, int anul, String titlu, String categorie) {
        this.autor = autor;
        this.nrPagini = nrPagini;
        this.anul = anul;
        this.titlu = titlu;
        this.categorie = categorie;
    }

    public String getAutor() {
        return autor;
    }

    public int getNrPagini() {
        return nrPagini;
    }

    public int getAnul() {
        return anul;
    }

    public String getTitlu() {
        return titlu;
    }
    public String getCategorie() {
        return categorie;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNrPagini(int nrPagini) {
        this.nrPagini = nrPagini;
    }

    public void setAnul(int anul) {
        this.anul = anul;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String descriere(){
        return ("Autorul acestei carti este:" + this.autor);
    }

    public  String tipul(){
        return "Cartea este in varianta tiparita";
    }

    @Override
    public String toString() {
        return "autor='" + autor + '\'' +
                ", nrPagini=" + nrPagini +
                ", anul=" + anul +
                ", titlu='" + titlu + '\'' +
                ", categorie='" + categorie;
    }
}
