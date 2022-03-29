package day02;

public class Overload_vs_Override {

    private final void method1(){

    }

    public void method1(int a){

    }

    private final static void method2(){

    }

    public static void method2(int a){

    }

    public Overload_vs_Override(){

    }

    public Overload_vs_Override(int a){

    }

}



class A{
    public void method(){
        System.out.println("A");
    }
}

class B extends A{

    /*
    public static void method(){

    }
    */

    @Override
     public void method(){
        System.out.println("B");
    }

}


class C{
    public static void main(String[] args) {
        new B().method();
    }
}




