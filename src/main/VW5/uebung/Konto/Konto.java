package Uebung.Konto;

public class Konto{
    private int kontonummer;
    private double betrag;

    public Konto(int nummer, double betrag){
        kontonummer = nummer;
        this.betrag = betrag;
    }

    public double getBetrag(){
        return betrag;
    }

    public void zahleEin(double betrag){
        this.betrag += betrag;
    }

    public void hebeAb(double betrag){
        this.betrag -= betrag;
    }

    @Override
    public String toString(){
        return "Das Konto mit der Nummer "+ kontonummer +" hat einen aktuellen Betrag von "+ String.format("%.2f", getBetrag()) +" Euro";
    }


}