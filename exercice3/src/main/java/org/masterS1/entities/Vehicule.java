package org.masterS1.entities;

public class Vehicule {

//    Créez une classe de base appelée Vehicule avec les attributs et méthodes suivants :
//     • Attributs :
//            ▪ nom : Une chaîne de caractères représentant le nom du véhicule.
//            ▪ prix : Un double représentant le prix du véhicule.
    protected String nom;
    protected double prix;

    public Vehicule(String nom, double prix) {
        this.nom = nom;
        this.prix = prix;
    }

    public Vehicule() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }
    //     • Méthodes :
//            ▪ emettreSon(): Une méthode qui affiche un son générique du véhicule (par exemple, "Le véhicule émet un son inconnu.").

    public void emettreSon(){
        System.out.println("Le véhicule émet un son inconnu.");
    }
//            ▪ afficherInformations(): Une méthode qui affiche des informations de base sur
//    le véhicule, y compris son nom et son prix.

    public void afficherInformations(){
        System.out.println("nom: "+nom+", prix: "+prix);
    }
}
