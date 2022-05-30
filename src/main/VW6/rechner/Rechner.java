public class Rechner {
    /**
     *
     * @param s1 erster Summand
     * @param s2 zweiter Summand
     * @return Summe s1 + s2
     */
    public static int add(int s1, int s2){
        return s1 + s2;
    }

    /**
     * ultimative Methode fuer die Division
     * internes casting zu double
     * @author Amir Ebrahimi
     * @param a Zaehler
     * @param b Nenner
     * @return Zaehler / Nenner
     */
    public static double div(int a, int b){
        return (double)a / b; //casting zu double
    }
}
