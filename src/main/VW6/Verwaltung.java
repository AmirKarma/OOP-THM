import java.util.ArrayList;

public class Verwaltung {
    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Opel");
        cars.add("BMW");
        cars.add("Ford");

        System.out.println(cars + " Länge: " + cars.size());

        cars.remove(1);
        System.out.println(cars + "Länge: " + cars.size());

        cars.remove("Opel");
        System.out.println(cars + " Länge: " + cars.size());

        cars.add("Mercedes");
        cars.add("Lada");
        cars.add("Audi");
        System.out.println(cars + " Länge: " + cars.size());
        cars.sort(null);
        System.out.println(cars + " Länge: " + cars.size());

    }
}
