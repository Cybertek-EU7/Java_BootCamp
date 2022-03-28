package day01;

public class CharSequences {

    public static void main(String[] args) {

        String str = "cydeo";

       str = str.toUpperCase(); //"CYDEO"

        System.out.println(str);

        String str2 = "Cydeo";

        str2 = str2.concat(" School"); //"Cydeo School"

        System.out.println(str2);

        System.out.println("---------------------------");

        StringBuilder sb1 = new StringBuilder("java");

        sb1.append(" programming");

        System.out.println(sb1);

        StringBuffer sb2 = new StringBuffer("java");

        sb2.append(" programming");

        System.out.println(sb2);




    }


    public synchronized void method1(){

    }



}
