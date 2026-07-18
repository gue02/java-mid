package collection.list.text.ex1;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class ListEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> integers = new ArrayList<>();
        int inputs;
        System.out.println("n개의 정수를 입력하세요 (종료 0)");
        while (true){
            inputs = scanner.nextInt();
            if(inputs == 0){
                break;
            }
            integers.add(inputs);
        }
        System.out.println("출력");
        for (int i = 0; i < integers.size(); i++){
            if (i == integers.size()-1){
                System.out.print(integers.get(i));
            }else {
                System.out.print(integers.get(i)+", ");
            }
        }
    }
}
