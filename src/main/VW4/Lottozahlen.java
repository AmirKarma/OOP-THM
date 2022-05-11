import java.util.Random;

public class Lottozahlen {
    static int[] zahlen = new int[100];
    static int[] doppelteZahlen = new int[50];

    public static void main(String[] args) {
        // initialisiere mit Zufallszahlen zwischen 1 und 49
        initArray();
        // Suche nach doppelten Zahlen
        // TODO: Besser -> zähle doppelte Zahlen
        sucheDoppelte();
        // Ausgabe wie oft die Zahlen zwischen 1 und 49 bei den 100
        // Zufallszahlen vorkommt
        // TODO: Methodengebundene Ausgaben an den Anfang der Methode schieben
        System.out.println("Auswertung");
        ausgabeArray(doppelteZahlen);
        // Suche nach dem erstmaligen Vorkommen einer doppelten Zahl
        // Ausgabe der Position
        //System.out.println("Erste doppelte Zahl bei: " + indexErsteDoppelte(zahlen));

        // Ausgabe eines Arrays: Index und Wert
        ausgabeArray(zahlen);
// Ausgabe von Maximal-, Minimal- und Durchschnitwert
        System.out.println("Maximalwert: " + maxWert());
        System.out.println("Minimalwert: " + minWert());
        System.out.println("Mittelwert: " + midWert());
    }

    public static void initArray() {
        Random zufall = new Random();
        for (int i = 0; i < zahlen.length; i++) {
            zahlen[i] = zufall.nextInt(1, 49);
        }
    }
    public static void sucheDoppelte() {
        //TODO: for(i...zahlen.length) -> doppelteZahlen[i]++;
        for (int i = 0; i < zahlen.length; i++) {
        }
    }

    public static void ausgabeArray(int[] zahlen) {
        for (int i = 0; i < zahlen.length; i++) {
            System.out.println(i + 1 + ":\t" + zahlen[i]);
        }
    }

    public static int maxWert() {
        int x = 0;
        for (int i : zahlen) {
            if (x < zahlen[i]) x = zahlen[i];
        }
        return x;
    }

    public static int minWert() {
        int x = Integer.MAX_VALUE;
        for (int i : zahlen) {
            if (x > zahlen[i]) x = zahlen[i];
        }
        return x;
    }

    public static double midWert() {
        int sum = 0;
        for (int i : zahlen) {
            sum += zahlen[i];
        }
        return (double) sum / zahlen.length;
    }
}