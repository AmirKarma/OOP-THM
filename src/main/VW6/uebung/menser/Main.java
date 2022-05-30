package uebung.menser;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Mahlzeit mahlzeit1 = new Mahlzeit("Hamburger","mit Remoulade \"" + "und Salzkartoffeln \n" + "dazu eine Beilage nach Wahl",2.50, false);
        Mahlzeit mahlzeit2 = new Mahlzeit("Mediter Nudelauflauf","mit Mascarponesauce \n" + "dazu eine Beilage nach Wahl", true);

        Mahlzeit mahlzeit3 = new Mahlzeit("Finn","mit Remoulade \"" + "und Salzkartoffeln \n" + "dazu eine Beilage nach Wahl",2.50, false);
        Mahlzeit mahlzeit4 = new Mahlzeit("Jan","mit Mascarponesauce \n" + "dazu eine Beilage nach Wahl", true);

        Mahlzeit mahlzeit5 = new Mahlzeit("Julia","mit Remoulade \"" + "und Salzkartoffeln \n" + "dazu eine Beilage nach Wahl",2.50, false);
        Mahlzeit mahlzeit6 = new Mahlzeit("Daniel","mit Mascarponesauce \n" + "dazu eine Beilage nach Wahl", true);

        Mahlzeit mahlzeit7 = new Mahlzeit("Amir","mit Remoulade \"" + "und Salzkartoffeln \n" + "dazu eine Beilage nach Wahl",2.50, false);
        Mahlzeit mahlzeit8 = new Mahlzeit("Guerkan","mit Mascarponesauce \n" + "dazu eine Beilage nach Wahl", true);

        Mahlzeit mahlzeit9 = new Mahlzeit("Qaweem","mit Remoulade \"" + "und Salzkartoffeln \n" + "dazu eine Beilage nach Wahl",2.50, false);
        Mahlzeit mahlzeit10 = new Mahlzeit("Tim","mit Mascarponesauce \n" + "dazu eine Beilage nach Wahl", true);

        Mahlzeit[][] mahlzeitliste = {{mahlzeit1,mahlzeit3, mahlzeit5, mahlzeit7, mahlzeit8 , mahlzeit9},{mahlzeit2,mahlzeit4, mahlzeit6, mahlzeit8, mahlzeit10}};
        System.out.println(mahlzeitliste[0][1]);



        }
    }

