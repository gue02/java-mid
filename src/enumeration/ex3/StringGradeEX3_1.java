package enumeration.ex3;

public class StringGradeEX3_1 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
        int basic = price - discountService.discount(Grade.BASIC,price);
        int gold = price - discountService.discount(Grade.GOLD,price);
        int diamond = price - discountService.discount(Grade.DIAMOND,price);

        System.out.println(basic);
        System.out.println(gold);
        System.out.println(diamond);

    }
}
