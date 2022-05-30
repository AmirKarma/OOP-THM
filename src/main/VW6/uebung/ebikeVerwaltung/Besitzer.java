package uebung.ebikeVerwaltung;

public class Besitzer {
    private String name;

    private String adresse;

    private String telefonnummer;

    public Besitzer(String name, String adresse, String telefonnummer){
        this.name = name;
        this.adresse = adresse;
        this.telefonnummer = telefonnummer;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" + "Adresse: " + adresse + "\n" + "Telefonnummer: " + telefonnummer;
    }

    public String getName() {
        return name;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getTelefonnummer() {
        return telefonnummer;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setTelefonnummer(String telefonnummer) {
        this.telefonnummer = telefonnummer;
    }
}
