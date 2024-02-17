package org.my_codes;


import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Map<String, Double> notesEtudiants = new HashMap<>();


        notesEtudiants.put("Alice", 14.5);
        notesEtudiants.put("Bob", 16.0);
        notesEtudiants.put("Charlie", 18.5);


        afficherNotes(notesEtudiants);


        String etudiantPourAugmentation = "Alice";
        notesEtudiants.computeIfPresent(etudiantPourAugmentation, (nom, note) -> note + 1.0);


        afficherNotes(notesEtudiants);


        String etudiantPourSuppression = "Bob";
        notesEtudiants.remove(etudiantPourSuppression);


        afficherNotes(notesEtudiants);


        System.out.println("Taille du map: " + notesEtudiants.size());


        afficherStatistiques(notesEtudiants);


        boolean noteParfaite = notesEtudiants.containsValue(20.0);
        System.out.println("Note parfaite trouvée ? " + noteParfaite);
    }

    private static void afficherNotes(Map<String, Double> notes) {
        notes.forEach((nom, note) -> System.out.println(nom + ": " + note));
    }

    private static void afficherStatistiques(Map<String, Double> notes) {
        double somme = notes.values().stream().mapToDouble(Double::doubleValue).sum();
        double moyenne = somme / notes.size();
        double max = notes.values().stream().mapToDouble(Double::doubleValue).max().orElse(0);
        double min = notes.values().stream().mapToDouble(Double::doubleValue).min().orElse(0);
        System.out.println("Note moyenne: " + moyenne + ", Max: " + max + ", Min: " + min);
    }
}
