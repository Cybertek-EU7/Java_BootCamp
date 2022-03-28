package day01;

public class CustomMethods {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4};
        int[] arr2 = {5,6,7,8,9};
        int[] arr3 = {10, 11, 12, 13};

        /*
        int[] arr1 = {1,2,3,4};

        for (int each : arr1) {
            System.out.println(each);
        }

        int[] arr2 = {5,6,7,8,9};

        for (int each : arr2) {
            System.out.println(each);
        }

        int[] arr3 = {10, 11, 12, 13};

        for (int each : arr3) {
            System.out.println(each);
        }
*/

        printEach(arr1);

        printEach(arr2);

        printEach(arr3);

        System.out.println("---------------------------");

        String str1 = "Java";
        String str2 = "Level";

        System.out.println( isPalindrome(str1));
        System.out.println( isPalindrome(str2));

        System.out.println("---------------------------");
        
        double[] nums = {1.5, 2.5, 3.5};

        printEach(nums);

        String[] names = {"Aysel", "Murat", "Selim", "Selbi"};
        
        printEach(names);
       

    }

    public static void printEach(int[] arr){
        System.out.println("--------------------");
        for (int each : arr) {
            System.out.println(each);
        }
    }

    public static void printEach(double[] arr){
        System.out.println("--------------------");
        for (double each : arr) {
            System.out.println(each);
        }
    }

    public static void printEach(char[] arr){
        System.out.println("--------------------");
        for (char each : arr) {
            System.out.println(each);
        }
    }

    public static void printEach(String[] arr){
        System.out.println("--------------------");
        for (String each : arr) {
            System.out.println(each);
        }
    }

    public static String reverse(String str){
        String result = "";

        for(int j = str.length()-1; j >= 0; j-- ){
            result += str.charAt(j);
        }

         return result;
    }
    
    public static boolean isPalindrome(String str){
        return reverse(str).equalsIgnoreCase(str);
    }


}
