package org.masterS1.sousClasses;

import org.masterS1.abstraite.Figure;

public class Rectangle extends Figure {
    double longueur;
    double largeur;

    public Rectangle(String nom, double longueur, double largeur) {
        super(nom);
        this.longueur = longueur;
        this.largeur = largeur;
    }

    public Rectangle() {
    }

    @Override
    public double calculerAire() {
        return longueur*largeur;
    }

    @Override
    public double calculerPerimetre() {
        return (2*(largeur+longueur));
    }
}
