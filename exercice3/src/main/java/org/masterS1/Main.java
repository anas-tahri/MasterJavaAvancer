package org.masterS1;

import org.masterS1.entities.Avion;
import org.masterS1.entities.Moto;
import org.masterS1.entities.Vehicule;
import org.masterS1.entities.Voiture;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        Créez un programme principal (une classe) pour tester vos classes en créant des objets de
//        différents types de véhicules, en définissant les attributs spécifiques à chaque véhicule, y
//        compris le prix, et en appelant la méthode emettreSon() pour faire émettre le son spécifique
//        de chaque véhicule. Enfin, affichez toutes les informations, y compris les attributs
//        supplémentaires et le prix, avec la méthode afficherInformations().
// first method
        /*Vehicule vehiculeVoiture = new Voiture("Audi",320000,"2023");
        Vehicule vehiculeMoto = new Moto("Moto",12000,"Marque");
        Vehicule vehiculeAvion = new Avion("Avion",4000000,"Comp1","5000");
        vehiculeVoiture.emettreSon();
        vehiculeMoto.emettreSon();
        vehiculeAvion.emettreSon();
        vehiculeVoiture.afficherInformations();
        vehiculeMoto.afficherInformations();
        vehiculeAvion.afficherInformations();*/

        //polymorphism method
        Vehicule[] vehicules= new Vehicule[3];
        vehicules[0]  = new Voiture("Audi",320000,"2023");
        vehicules[1]  = new Moto("Moto",12000,"Marque");
        vehicules[2]  = new Avion("Avion",4000000,"Comp1","5000");
        for (Vehicule vehicule: vehicules){
            vehicule.emettreSon();
            vehicule.afficherInformations();
        }
    }
}
