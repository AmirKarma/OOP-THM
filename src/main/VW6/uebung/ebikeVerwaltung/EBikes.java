package uebung.ebikeVerwaltung;

public class EBikes {
    private String hersteller;
    private int ladespannung;
    private Besitzer besitzer;

    public EBikes(String hersteller, int ladespannung, Besitzer besitzer){
        this.hersteller = hersteller;
        this.ladespannung = ladespannung;
        this.besitzer = besitzer;
    }

    @Override
    public String toString() {
        return "Hersteller: " + hersteller + "\n"+"Ladespannung: " + ladespannung + "\n" + "Besitzer:\n" + besitzer;
    }

    public String getHersteller() {
        return hersteller;
    }

    public int getLadespannung() {
        return ladespannung;
    }

    public Besitzer getBesitzer() {
        return besitzer;
    }

    public void setHersteller(String hersteller) {
        this.hersteller = hersteller;
    }

    public void setLadespannung(int ladespannung) {
        this.ladespannung = ladespannung;
    }

    public void setBesitzer(Besitzer besitzer) {
        this.besitzer = besitzer;
    }
}