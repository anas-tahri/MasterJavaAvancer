package org.masterS1.sousClasses;

import org.masterS1.abstraite.Figure;

public class Cercle extends Figure {
    double rayon;

    final double PI =3.14;
    public Cercle() {
    }

    public Cercle(String nomString, double rayon) {
        super(nomString);
        this.rayon = rayon;
    }

    @Override
    public double calculerAire() {
        return PI*Math.pow(rayon,2);
    }

    @Override
    public double calculerPerimetre() {
        return PI*2*rayon;
    }
}
