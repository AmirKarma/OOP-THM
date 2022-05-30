public class Tester {
    public static void main(String[] args) {
        int a = 22;
        int b = 10;

        int erg = Rechner.add(a,b);
        System.out.println(a+" + " + b + " = " +erg);
        System.out.println(a + " / " + b + " = " + Rechner.div(a,b));


    }
}
