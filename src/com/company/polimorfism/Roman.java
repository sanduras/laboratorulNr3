package com.company.polimorfism;

public class Roman extends Carte {

    private int nrCapitole;
    private String wordArt;

    public Roman(String autor, int nrPagini, int anul, String titlu, String categorie, int nrCapitole, String wordArt) {
        super(autor, nrPagini, anul, titlu,"Roman");
        this.nrCapitole = nrCapitole;
        this.wordArt = wordArt;
    }

    public String getWordArt() {
        return wordArt;
    }

    public int getNrCapitole() {
        return nrCapitole;
    }

    public void setWordArt(String wordArt) {
        this.wordArt = wordArt;
    }

    public void setNrCapitole(int nrCapitole) {
        this.nrCapitole = nrCapitole;
    }

    @Override
    public String descriere() {
        return ("Cartea data face parte din categoria " + getCategorie() +
                ", este o frumoasa capodobera scrisa de " + getAutor() + "\n" +
                "Cartea impresioneaza prin maniera frumoasa a textului " + this.wordArt +
                ", scrisa in proza avind " + this.nrCapitole +
                " capitole");
    }

    @Override
    public  String tipul(){
        return "Romanul este in varianta tiparita";
    }

    @Override
    public  String toString() {
        return super.toString() +  '\'' +
                ", NrCapitole='" + nrCapitole + '\'' +
                ", WordArt=" + wordArt;
}

}
