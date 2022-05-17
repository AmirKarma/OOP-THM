import java.util.*;

public class Messwerte {
    public static final int[] HOURS = new int[24];
    public static final double[] TEMPERATURE = new double[24];

    public static void main(String[] args) {
        initArray ();
        System.out.println(sus());


    }

    public static void initArray(){
        Random zufall = new Random();
        double grad = 0;

        for (int i = 0; i < HOURS.length; i++){
            grad = Math.round(zufall.nextDouble (1,40)*10.0) / 10.0 ;
            TEMPERATURE[i] = grad;
            HOURS[i] = i+1;
            System.out.println (TEMPERATURE[i] + " " + HOURS[i]);
        }

    }

    public static int findMax(){
        double max = 0;
        int index = 0;
        for (int i = 0; i < HOURS.length; i++){
            if(max < TEMPERATURE[i]){
                max = TEMPERATURE[i];
                index = i;
            }
        }
        return index;
    }

    public static int findMin(){
        double min = Double.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < HOURS.length; i++) {
            if(min > TEMPERATURE[i]){
                min = TEMPERATURE[i];
                index = i;

            }
        }
        return index;
    }

    public static String sus(){
        return "\"Um " + HOURS[findMax()] +" Uhr war es am wärmsten mit " + TEMPERATURE[findMax()] +  "°C\"\n" +
                "\"Um " + HOURS[findMin()] +" Uhr war es am kältesten mit " + TEMPERATURE[findMin()] + "°C\"";
    }
}
