package Uebung.Konto;

import Uebung.Konto.Konto;

public class Main {

    public static void main(String[] args) {
        Konto jan = new Konto(557799,1000.0);
        System.out.println(jan);
        jan.zahleEin(58.00);
        jan.hebeAb(500);
        System.out.println(jan.getBetrag());
        System.out.println(jan);
    }
}
