package org.masterS1.entities;

public class Adherent extends Personne{

//    2. Créez une deuxième classe Adherent qui hérite de la classe Personne et qui contient
//    l’attribut numAdherent et redéfinit la méthode toString().
    private String numAdherent;

    public Adherent(String nom, String prenom, String email, String tel, int age, String numAdherent) {
        super(nom, prenom, email, tel, age);
        this.numAdherent = numAdherent;
    }

    public Adherent() {
    }

    public String getNumAdherent() {
        return numAdherent;
    }

    public void setNumAdherent(String numAdherent) {
        this.numAdherent = numAdherent;
    }

    @Override
    public String toString() {
        return "Adherent{" +
                super.toString()+
                "numAdherent='" + numAdherent + '\'' +
                '}';
    }
}
