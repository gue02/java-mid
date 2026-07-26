package collection.map.test;

import java.util.*;

public class ArrayToMapTest {
    public static void main(String[] args) {
        String[][] productArr = {{"Java", "10000"}, {"Spring", "20000"},
                {"JPA", "30000"}};

        Map<String, String> products = new HashMap<>();
        for (int i = 0; i < 3; i++) {
            products.put(productArr[i][0],productArr[i][1]);
        }

        for (String key : products.keySet()){
            System.out.println("제품 : "+ key + ", 가격 : "+products.get(key));
        }
    }
}