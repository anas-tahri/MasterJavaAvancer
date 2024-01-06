package org.masterS1.entities;

public class Auteur extends Personne{

//    3. Créez une troisième classe Auteur qui hérite de la classe Personne, qui contient l’attribut
//    numAuteur et redéfinit la méthode toString().
    private String numAuteur;

    public Auteur(String nom, String prenom, String email, String tel, int age, String numAuteur) {
        super(nom, prenom, email, tel, age);
        this.numAuteur = numAuteur;
    }

    public Auteur() {
    }

    public String getNumAuteur() {
        return numAuteur;
    }

    public void setNumAuteur(String numAuteur) {
        this.numAuteur = numAuteur;
    }


    @Override
    public String toString() {
        return "Auteur{" +
                super.toString()+
                "numAuteur='" + numAuteur + '\'' +
                '}';
    }
}
