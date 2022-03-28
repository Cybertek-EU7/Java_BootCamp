package day01;

public class WrapperClasses {

    public static void main(String[] args) {

        int a = 100;
        long b = a;

        Long num = (long)a;

        Integer num2 = a;  //Autoboxing

        double x = 2.5;

        Double num3 = x;

        System.out.println("--------------------------------");

        String str = "30";

        System.out.println(str + 1);

        int y = Integer.parseInt(str);

        Integer z = Integer.valueOf(str);

        System.out.println(y + 1);
        System.out.println(z + 1);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);



    }

}
