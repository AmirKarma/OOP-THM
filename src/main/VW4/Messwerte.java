import java.util.*;

public class Messwerte {
    public static int[] hours = new int[24];
    public static double[] temperature = new double[24];

    public static void main(String[] args) {
        initArray ();


    }

    public static void initArray(){
        Random zufall = new Random();
        double grad = 0;

        for (int i = 0; i < hours.length; i++){
            grad = Math.round(zufall.nextDouble (1,40)*100.0) / 100.0 ;
            Arrays.fill ( temperature, grad );
            hours[i] = i+1;
            System.out.println (temperature[i]);
        }

    }

    public static double findMax(){
        double max = 0;
        for (double i : temperature){
            if(max < i) max = i;
        }
        return max;
    }

    public static int findMin(){
        return 1;
    }
}
