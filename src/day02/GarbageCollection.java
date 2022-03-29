package day02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GarbageCollection {

    public static void main(String[] args) {

        String str = "Java";

        str = null;

        System.out.println(str);

        System.out.println("----------------------");

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4));

        list = new ArrayList<>(Arrays.asList(10, 20, 30, 40));

        System.out.println(list);



    }

}
