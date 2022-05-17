public class Studierendenverwaltung {
    public static void main(String[] args) {
        Student emil = new Student("Emil","Maier", 1234);
        Student erika = new Student("Erika","Schmidt",4567);

        // emil.name ="Maier";
        // emil.vorname = "Emil";
        // emil.matrNr = 1234;

        System.out.println(emil.wieHeisstDu() + " hat die MatrNr " + emil.sagMatrNr());

        //emil.name ="Schmidt";
        //emil.vorname = "Erika";
        //emil.matrNr = 4567;

        System.out.println(erika.wieHeisstDu() + " hat die MatrNr " + erika.sagMatrNr());
    }
}