package day02;

import java.util.*;

public class CollectionPractice {

    public static void main(String[] args) {

        Set<Integer> set = new LinkedHashSet<>();
        set.add(20);
        set.add(15);
        set.add(25);
        set.add(10);

        System.out.println(set);

        System.out.println("------------------------------------");

        List<Integer> list = new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5,5,1,1,2,2,3,3,4,4,4));


        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) %2 ==0){
                list.remove(i);
            }
        }

        System.out.println(list);

        System.out.println("------------------------------------");

        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5,5,1,1,2,2,3,3,4,4,4));

        Iterator<Integer> it = list2.iterator();

        while (it.hasNext()){
            if(it.next() %2 ==0){
                it.remove();
            }
        }

        System.out.println(list2);

        System.out.println("------------------------------------");

        List<Integer> list3 = new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5,5,1,1,2,2,3,3,4,4,4));
        list3.removeIf( p -> p %2 ==0 );

        System.out.println(list3);


    }

}
