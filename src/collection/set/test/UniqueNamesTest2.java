package collection.set.test;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class UniqueNamesTest2 {
    public static void main(String[] args) {
        Integer[] inputArr = {30,20,20,10,10};

        LinkedHashSet<Integer> integers = new LinkedHashSet<>();
        for(Integer integer : inputArr){
            integers.add(integer);
        }
        for (Integer set : integers){
            System.out.println(set);
        }
    }
}
