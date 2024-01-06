package org.masterS1.entities;

public class Avion extends Vehicule{

//    Avion : une classe qui hérite de Vehicule et a les attributs supplémentaires
//    compagnie, vitesseMax, et redéfinit la méthode emettreSon() pour afficher "L'Avion
//    fait un bruit de moteur puissant.".


    private String compagnie;
    private String vitesseMax;

    public Avion(String nom, double prix, String compagnie, String vitesseMax) {
        super(nom, prix);
        this.compagnie = compagnie;
        this.vitesseMax = vitesseMax;
    }

    public Avion() {
    }

    public String getCompagnie() {
        return compagnie;
    }

    public void setCompagnie(String compagnie) {
        this.compagnie = compagnie;
    }

    public String getVitesseMax() {
        return vitesseMax;
    }

    public void setVitesseMax(String vitesseMax) {
        this.vitesseMax = vitesseMax;
    }

    @Override
    public void emettreSon(){
        System.out.println("L'Avion fait un bruit de moteur puissant.");
    }

    @Override
    public void afficherInformations() {
        super.afficherInformations();
        System.out.println("compagnie: "+ compagnie+", vitesseMax: "+vitesseMax);
    }
}
