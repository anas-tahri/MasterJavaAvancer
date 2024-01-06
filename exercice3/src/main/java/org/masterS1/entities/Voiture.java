package org.masterS1.entities;

public class Voiture extends Vehicule{

    /*• Voiture : une classe qui hérite de Vehicule et a les attributs supplémentaires modele,
    annee, et redéfinit la méthode emettreSon() pour afficher "La voiture vrombit.".*/
    private String modeleAnnee;

    public Voiture(String nom, double prix, String modeleAnnee) {
        super(nom, prix);
        this.modeleAnnee = modeleAnnee;
    }

    public Voiture() {
    }

    public String getModeleAnnee() {
        return modeleAnnee;
    }

    public void setModeleAnnee(String modeleAnnee) {
        this.modeleAnnee = modeleAnnee;
    }

    @Override
    public void emettreSon(){
        System.out.println("La voiture vrombit.");
    }

    @Override
    public void afficherInformations() {
        super.afficherInformations();
        System.out.println("modeleAnnee: "+ modeleAnnee);
    }
}
