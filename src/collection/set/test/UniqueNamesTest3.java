package collection.set.test;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class UniqueNamesTest3 {
    public static void main(String[] args) {
        Integer[] inputArr = {30,20,20,10,10};

        Set<Integer> integers = new TreeSet<>();
        for(Integer integer : inputArr){
            integers.add(integer);
        }
        for (Integer set : integers){
            System.out.println(set);
        }
    }
}
