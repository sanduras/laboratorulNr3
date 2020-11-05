package com.company.polimorfism;

public class Drame extends Carte {
    private String scene;
    private  String tablouri;

    public Drame(String autor, int nrPagini, int anul, String titlu, String categorie, String scene, String tablouri) {
        super(autor, nrPagini, anul, titlu, categorie);
        this.scene = scene;
        this.tablouri = tablouri;
    }

    public String getScene() {
        return scene;
    }

    public String getTablouri() {
        return tablouri;
    }

    public void setScene(String scene) {
        this.scene = scene;
    }

    public void setTablouri(String tablouri) {
        this.tablouri = tablouri;
    }

    @Override
    public String descriere() {
        return ("Cartea data face parte din categoria " + getCategorie() +
                ", este o frumoasa capodobera scrisa de " + getAutor() + "\n" +
                "Cartea impresioneaza prin viata protagonistului ce lupta si trece prin scene de " + this.scene + "\n" +
                ", scrisa in proza avand tablouri descriptive " + this.tablouri);
    }

    @Override
    public  String tipul(){
        return "Drama este in varianta tiparita";
    }

    @Override
    public String toString() {
        return super.toString() +
                "scene='" + scene + '\'' +
                ", tablouri=" + tablouri;
    }
}
