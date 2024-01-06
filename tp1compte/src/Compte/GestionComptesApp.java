package Compte;

public class GestionComptesApp {

    public  void demo() {
        Compte c1 = new Compte(11111, "Ahmad", 20000);
        Compte c2 = new Compte(22222, "Hajar", 30000);
        c1.retirer(19000);
        c2.retirer(45000);
        c1.deposer(15000);
        c1.afficherCompteInfo();
        c2.afficherCompteInfo();
    }

}
