public class Konto {
    private int ktoNr = 0; //Kontonummer
    private int betrag = 0; // Betrag auf dem Konto
    private static int anzKto = 0;

    public Konto(int ktoNr){
        this.ktoNr = ktoNr;
        anzKto++;
    }

    public void einzahlen(int menge){
        betrag+= menge;
    }
    public int abheben(int menge) {
        if((betrag - menge) >= 0){
            betrag-= menge;
            return menge;
        } else {
            int rest = betrag;
            betrag = 0;
            return rest;
        }
    }
    public String toString(){
        if(betrag == 0){
            return "Anz Konten: " + anzKto+ "Kontonummer: " + ktoNr +" ist leer";
        } else {
            return "Anz Konten: " + anzKto+ "Kontonummer: " + ktoNr + " hat Betrag: " +betrag;
        }
    }
}
