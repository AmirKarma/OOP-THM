package uebung.menser;

import java.util.ArrayList;

public class Mahlzeit {
    private String name;
    private String description;
    private double price;
    private boolean vegetarian;

    public Mahlzeit(String name, String description, double price, boolean vegetarian){
        this.name = name;
        this.description = description;
        this.price = price;
        this.vegetarian = vegetarian;
    }

    public Mahlzeit( String name,String description ,boolean vegetarian){

        this(name, description,2.5,vegetarian);
    }

    public double getPreisStundet(){
        return Math.round(this.price * 100.0) * 100.0;
    }

    public double getPreisMitarbeiter(){
        return Math.round((this.price + 2.00) * 100.0) * 100.0;
    }

    public double getPreisGast(){
        return Math.round((this.price + 2.50) * 100.0) * 100.0;
    }

    @Override
    public String toString() {
        return "name: " + name + "\n" + "description: " + description + "\n" + "price: " + price + "€ \n" + "Vegetarian: " + vegetarian;
    }
}
