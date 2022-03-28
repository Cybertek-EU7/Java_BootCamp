package day01;

public class Constructor {

    int a;
    int b;
    int c;

    public Constructor() {
        System.out.println("Constructor 1");
    }

    public Constructor(int a) {
        this.a = a;
        System.out.println("Constructor 2");
    }

    public Constructor(int a, int b) {
        this(a); // Constructor 2
        this.b = b;
        System.out.println("Constructor 3");
    }

    public Constructor(int a, int b, int c) {
        this(a, b);
        this.c = c;
        System.out.println("Constructor 4");
    }


    public static void main(String[] args) {

        Constructor obj = new Constructor(10, 15, 20);


    }


}
