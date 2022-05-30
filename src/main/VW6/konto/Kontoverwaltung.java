public class Kontoverwaltung {
    public static void main(String[] args) {
        Konto meinKonto = new Konto(4711);
        Konto meinKonto2 = new Konto(4712);
        int geld;
        meinKonto.einzahlen(100);
        System.out.println(meinKonto);

        geld = meinKonto.abheben(70);
        System.out.println("abgehoben " + geld);
        System.out.println(meinKonto);

        geld = meinKonto.abheben(500);
        System.out.println("abgehoben: " + geld);
        System.out.println(meinKonto);
    }
}
