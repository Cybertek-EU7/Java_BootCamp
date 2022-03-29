package day02;

public final class FinalKeyword {

    public static void main(String[] args) {

        final int a = 30;
       // a = 40;
       // a = 50;

    }


    public final void method(){
        System.out.println("A");
    }


}

/*
class D extends FinalKeyword{

    public void method(){
        System.out.println("B");
    }

    }
    */

