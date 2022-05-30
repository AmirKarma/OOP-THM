public class Student {
    private int matrNr;
    private String name;
    private int gebJahr;

    public Student(String name, int matrNr, int gebJahr) {
        this.matrNr = matrNr;
        this.name = name;
        this.gebJahr = gebJahr;
    }

    @Override
    public String toString() {
        return "Name: " + name + " MatrNr.: " + matrNr;
    }

    public int getGebJahr(int heute) {
        return heute - gebJahr;
    }

    private String getName() {
        return name;
    }

    public int getMatrNr() {
        return matrNr;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMatrNr(int matrNr) {
        this.matrNr = matrNr;
    }
}
