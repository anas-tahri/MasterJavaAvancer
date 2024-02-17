package org.my_codes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // Génère getters, setters, toString, equals et hashCode.
@NoArgsConstructor // Génère un constructeur sans argument.
@AllArgsConstructor // Génère un constructeur avec tous les arguments.
class Produit {
    private long id;
    private String nom;
    private double prix;
}
