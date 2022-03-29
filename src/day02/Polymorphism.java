package day02;

public class Polymorphism {

    public static void main(String[] args) {

       // Shape shape =  (Shape) new Circle(); // up casting

        Shape shape = new Circle(); // up casting

       // System.out.println( shape.r );

        ( (Circle)shape ).r = 5;
        System.out.println(    ( (Circle)shape ).r    );  // down casting


        System.out.println(  ( (Square)shape ).side  );



    }

}
