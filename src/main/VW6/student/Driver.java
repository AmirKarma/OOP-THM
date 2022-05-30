public class Driver {
    public static void main(String[] args) {
        Student jan = new Student("Weis", 12345, 1997);
        System.out.println(jan);

        //Name soll in "von Weis" geändert werden
        jan.setName("von Weis");
        System.out.println(jan + ", Alter " + jan.getGebJahr(2022));
    }
}