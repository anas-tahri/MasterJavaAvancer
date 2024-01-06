package org.masterS1.entities;

public class Personne {



//            1. Créez une classe Personne avec les attributs privés : nom, prenom, email, tel, et age.
    protected String nom;
    protected String prenom;
    protected String email;
    protected String tel;
    protected  int age;

//    Ajoutez le constructeur avec paramètres pour initialiser les différents attributs et la méthode

    public Personne(String nom, String prenom, String email, String tel, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.tel = tel;
        this.age = age;
    }

    public Personne() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

//    toString() qui retourne une chaîne de caractères contenant les valeurs des attributs.


    @Override
    public String toString() {
        return
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                ", tel='" + tel + '\'' +
                ", age=" + age +'\'';
    }
}
