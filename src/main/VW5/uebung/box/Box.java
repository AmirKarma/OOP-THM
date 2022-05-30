package Uebung.Box;

public class Box {
    private int length;
    private int width;
    private int height;

    public Box(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Box(int length){
        this.length = length;
        this.width = length;
        this.height = length;
    }

    public void scale(int scalingFactor){
        width *= scalingFactor;
        length*= scalingFactor;
        height*= scalingFactor;
    }

    public int getVolume(){
        return width * height * length;
    }

    public int getSurfaceArea(){return 2*(width * height + width * length + length * height);}

    public boolean isCube(){
        return width == height && height == length;
    }

    @Override
    public String toString(){
        if(isCube()) return "Haha";
        else return "lol";
    }
}
