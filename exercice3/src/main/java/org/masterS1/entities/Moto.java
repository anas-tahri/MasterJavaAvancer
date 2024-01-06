package org.masterS1.entities;

public class Moto extends Vehicule{

//    Moto : une classe qui hérite de Vehicule et a les attributs supplémentaires marque,
//    puissance, et redéfinit la méthode emettreSon() pour afficher "La moto rugit.".

    private String marque;

    public Moto(String nom, double prix, String marque) {
        super(nom, prix);
        this.marque = marque;
    }

    public Moto() {
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    @Override
    public void emettreSon(){
        System.out.println("La moto rugit.");
    }

    @Override
    public void afficherInformations() {
        super.afficherInformations();
        System.out.println("marque: "+ marque);
    }
}
