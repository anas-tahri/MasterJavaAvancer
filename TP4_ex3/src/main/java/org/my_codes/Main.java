package org.my_codes;


import java.util.HashSet;
import java.util.Set;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // 1. Créer deux Sets de type HashSet
        Set<String> groupeA = new HashSet<>();
        Set<String> groupeB = new HashSet<>();

        // 2. Ajouter des noms des étudiants à chaque HashSet
        groupeA.add("Alice");
        groupeA.add("Bob");
        groupeA.add("Charlie");

        groupeB.add("Charlie");
        groupeB.add("David");
        groupeB.add("Eva");

        // 3. Afficher l’intersection des deux HashSets
        Set<String> intersection = new HashSet<>(groupeA);
        intersection.retainAll(groupeB);
        System.out.println("Intersection de groupeA et groupeB : " + intersection);

        // 4. Afficher l’union des deux HashSets
        Set<String> union = new HashSet<>(groupeA);
        union.addAll(groupeB);
        System.out.println("Union de groupeA et groupeB : " + union);
    }
}
