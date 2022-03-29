package day02;

interface Volume{

    boolean hasVolume = true; // public static final

    /*
    public static void main(String[] args) {
        System.out.println(hasVolume);
    }
  */
    void volume();

}

abstract class Shape{

    public abstract double area();
    //public abstract double volume();

}

class Circle extends Shape{
    double r;

    @Override
    public double area() {
        return r * r * 3.14;
    }
}

class Square extends Shape{
    double side;

    @Override
    public double area() {
        return side * side;
    }
}



public class Abstraction {
    public static void main(String[] args) {
       // new Shape();
    }
}
