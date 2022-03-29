package day02;

import java.io.FileInputStream;

public class Exceptions {

    public static void main(String[] args) throws InterruptedException {


      //  System.out.println( "Java".charAt(2000) );  // unchecked exception

    //    FileInputStream file = new FileInputStream("Path"); //checked exception

   //     Thread.sleep(3000); // checked exception

        System.out.println("Test1 Started");

        try {
            System.out.println("Java".charAt(2000));
        }catch (RuntimeException e){
            e.printStackTrace();
            // System.exit(0);
        }finally {
            System.out.println("Finally block");
        }

        System.out.println("Test1 completed");


        System.out.println("Test2 Started");

        Thread.sleep(3000);

        System.out.println("Test2 completed");

    }


    public static void method1() throws InterruptedException {
        Thread.sleep(3000);
    }


    public static void method2(){
     //   method1();
    }


}
