package collection.set.test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetOperationsTest {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(List.of(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(List.of(3, 4, 5, 6, 7));

        Set<Integer> set3 = new HashSet<>();
        set3.addAll(set1);
        set3.addAll(set2);

        Set<Integer> set4 = new HashSet<>();
        set4.addAll(set1);
        set4.removeAll(set2);

        Set<Integer> set5 = new HashSet<>();
        set5.addAll(set1);
        set5.retainAll(set2);

        System.out.println("집합");
        for (Integer integer : set3){
            System.out.print(integer+" ");
        }
        System.out.println();

        System.out.println("차집합");
        for (Integer integer : set4){
            System.out.print(integer+" ");
        }
        System.out.println();

        System.out.println("교집합");
        for (Integer integer : set5){
            System.out.print(integer+" ");
        }
    }
}
