package day01;

import java.util.Arrays;

public class ArrayPractice {

    public static void main(String[] args) {

        Integer[]  nums = new Integer[5]; //index: 0 ~ 4
        nums[0] = 10;
        nums[1] = 20;
        nums[2] = 30;
        nums[3] = 40;
        nums[4] = 50;
       // nums [5] = 60;

        System.out.println(Arrays.toString(nums));

        System.out.println("-----------------------------");

        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {6,7,8};
        int[] arr3 = {9, 10};

        int[][] arr2D1 = {arr1, arr2, arr3};
        int[][] arr2D2 = {arr1, arr2, arr3};
        int[][] arr2D3 = {arr1, arr2, arr3};

        System.out.println( Arrays.deepToString(arr2D1));

        int[][][] arr3D = {arr2D1, arr2D2, arr2D3};

        System.out.println( Arrays.deepToString(arr3D));

        System.out.println("-----------------------------");

        String[] names = {"Aysel", "Murat", "Selim", "Selbi"};

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }






    }

}
