package org.masterS1;

import org.masterS1.entities.Adherent;
import org.masterS1.entities.Auteur;
import org.masterS1.entities.Livre;

public class Main {
    public static void main(String[] args) {
//        5. Créez une application qui contient une méthode main() pour tester les différentes classes,
//                dans laquelle :
//— déclarez et intentiez un adhèrent ;
//— déclarez et instanciez un livre qui est écrit par un auteur ;
//— affichez les informations de l’adhèrent et du livre.

        Adherent adherent1 = new Adherent("tahri","anas","anastahri45@gmail.com","0675151026",22,"12345");
        Livre livre1 = new Livre(1234,"ONE PIECE",new Auteur("Oda","Eiichirō","oda@gmail.com","0600000000",38,"12345"));
        System.out.println(adherent1);
        System.out.println(livre1);
    }
}
