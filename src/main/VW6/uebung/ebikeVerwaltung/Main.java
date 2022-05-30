package uebung.ebikeVerwaltung;

public class Main {
    public static void main(String[] args) {
        Besitzer besitzer1 = new Besitzer("Mattes","Wieseckerweg 44,35396 Gießen(3.OG)", "01785183420");
        EBikes ebike1 = new EBikes("Guerkan-GmbH",220,besitzer1);

        System.out.println(ebike1);
    }
}