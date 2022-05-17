public class Student {
    //Attribute
    private String name;
    private String vorname;
    private int matrNr;
    //Methoden

    //Konstruktor
    public Student(String vorname, String name, int matrNr){
        this.vorname = vorname;
        this.name = name;
        this.matrNr = matrNr;
    }

    public String wieHeisstDu(){
        return vorname + " " + name;
    }

    public int  sagMatrNr(){
        return matrNr;
    }
}
/* public class Student {
    public String name;
    public String vorname;
    public int matrNr;

    public int  sagMatrNr(){
        return matrNr;
    }
} */