package org.masterS1.abstraite;

public abstract class Figure {
    protected String nom;
    public abstract double calculerAire();
    public abstract double calculerPerimetre();

    public void afficherDetails(){
        System.out.println("Nom: "+nom);
        System.out.println("Aire: "+calculerAire());
        System.out.println("Perimetre: "+calculerPerimetre());
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Figure(String nom) {
        this.nom = nom;
    }

    public Figure() {
    }
}
