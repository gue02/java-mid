package collection.list.text.ex1;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class ListEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> integers = new ArrayList<>();
        int inputs;
        double average;
        int sum = 0;
        System.out.println("n개의 정수를 입력하세요 (종료 0)");
        while (true){
            inputs = scanner.nextInt();
            if(inputs == 0){
                break;
            }
            integers.add(inputs);
        }
        for (int i = 0; i < integers.size(); i++) {
            sum += integers.get(i);
        }
        average = (double)sum / integers.size();
        System.out.println("입력한 정수의 합계: "+sum);
        System.out.println("입력한 정수의 평균: "+average);
    }
}
