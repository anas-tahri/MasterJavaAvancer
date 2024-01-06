package Compte;

public class Compte {
    private String nomClient;
    private long num;
    private double sold;

    public String getNomClient() {
        return nomClient;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    public long getNum() {
        return num;
    }

    public void setNum(long num) {
        this.num = num;
    }

    public double getSold() {
        return sold;
    }

    public void setSold(double sold) {
        this.sold = sold;
    }

    public Compte() {
    }

    public Compte(long num, String nomClient, double sold) {
        this.nomClient = nomClient;
        this.num = num;
        this.sold = sold;
    }


    public void afficherCompteInfo() {
        System.out.println( "Compte{" +
                "nomClient='" + nomClient + '\'' +
                ", num=" + num +
                ", sold=" + sold +
                '}');
    }

    public void retirer(double sold){
        if (this.sold-sold>0)
            this.sold=this.sold-sold;
    }

    public void deposer(double sold){

            this.sold=this.sold+sold;
    }
}
