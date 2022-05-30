package uebung.box;

public class Main {
    public static void main(String[] args) {
        Box danielsBox = new Box(3,4,5);
        Box finnsBox = new Box(4);
        System.out.println("Volume: " + danielsBox.getVolume());
        System.out.println("Öberfläsche: " + danielsBox.getSurfaceArea() + "\n");
        System.out.println("Volume: " + finnsBox.getVolume());
        System.out.println("Öberfläche " + finnsBox.getSurfaceArea() + "\n");
        danielsBox.scale(2);
        finnsBox.scale(2);
        System.out.println("Volume: " + danielsBox.getVolume());
        System.out.println("Öberfläsche: " + danielsBox.getSurfaceArea() + "\n");
        System.out.println("Volume: " + finnsBox.getVolume());
        System.out.println("Öberfläche " + finnsBox.getSurfaceArea() + "\n");
        System.out.println(finnsBox.isCube());
        System.out.println(danielsBox.isCube());
        System.out.println(finnsBox);
        System.out.println(danielsBox);

    }




}
