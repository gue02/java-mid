package mid_1_ex;

import java.time.LocalDateTime;

public class OrderMain {
    public static void main(String[] args) {
        String input = "1-50000";
        String[] inputs = input.split("-");
        int price = Integer.parseInt(inputs[1]);

        LocalDateTime now = LocalDateTime.now();
        LocalDateTime arriveTime = now.plusDays(3);
        System.out.println("예상 배송시간: "+arriveTime);
    }
}
