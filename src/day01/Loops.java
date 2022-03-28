package day01;

import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {

        for(int i = 1; i < 6; i++ ){
            System.out.println("EU7");
        }


        System.out.println("---------------------------------");

        int i = 1;
        while( i < 6 ){
            System.out.println("EU7");
            i++;
        }

        System.out.println("---------------------------------");

        String input = new Scanner(System.in).nextLine();  // "Java"

        String result = ""; //"avaJ"

        for(int j = input.length()-1; j >= 0; j-- ){
            result += input.charAt(j);
        }

        System.out.println(result);

    }

}
