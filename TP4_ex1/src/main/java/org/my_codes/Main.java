package org.my_codes;


import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Produit> produits = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Ajout de produits
        produits.add(new Produit(1, "Produit 1", 10.99));
        produits.add(new Produit(2, "Produit 2", 20.99));
        produits.add(new Produit(3, "Produit 3", 30.99));

        // Affichage des produits
        produits.forEach(System.out::println);

        // Suppression d'un produit par indice
        System.out.println("Entrez l'indice du produit à supprimer:");
        int index = scanner.nextInt();
        if (index >= 0 && index < produits.size()) {
            produits.remove(index);
        }

        // Affichage après suppression
        produits.forEach(System.out::println);

        // Modification d'un produit par indice
        System.out.println("Entrez l'indice du produit à modifier:");
        int modIndex = scanner.nextInt();
        if (modIndex >= 0 && modIndex < produits.size()) {
            System.out.println("Entrez le nouveau nom:");
            String nouveauNom = scanner.next();
            System.out.println("Entrez le nouveau prix:");
            double nouveauPrix = scanner.nextDouble();
            Produit produitModifie = produits.get(modIndex);
            produitModifie.setNom(nouveauNom);
            produitModifie.setPrix(nouveauPrix);
        }

        // Affichage après modification
        produits.forEach(System.out::println);

        // Recherche d'un produit par nom
        System.out.println("Entrez le nom du produit à rechercher:");
        String nomRecherche = scanner.next();
        produits.stream()
                .filter(produit -> produit.getNom().equalsIgnoreCase(nomRecherche))
                .findFirst()
                .ifPresentOrElse(
                        System.out::println,
                        () -> System.out.println("Produit non trouvé.")
                );
    }
}
