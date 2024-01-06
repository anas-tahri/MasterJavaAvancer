package org.masterS1.entities;

public class Livre {

//    4. Créez la classe Livre qui contient un attribut ISBN (entier), un titre (chaîne ) et un auteur.
    private int isbn;
    private String titre;
    private Auteur auteur;

    public Livre(int isbn, String titre, Auteur auteur) {
        this.isbn = isbn;
        this.titre = titre;
        this.auteur = auteur;
    }

    public Livre() {
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public Auteur getAuteur() {
        return auteur;
    }

    public void setAuteur(Auteur auteur) {
        this.auteur = auteur;
    }



    //    Ajoutez également la méthode toString() qui retourne le ISBN, le titre et les informations de l’auteur.


    @Override
    public String toString() {
        return "Livre{" +
                "isbn=" + isbn +
                ", titre='" + titre + '\'' +
                ", " + auteur.toString() +
                '}';
    }
}
