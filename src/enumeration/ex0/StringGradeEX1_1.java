package enumeration.ex0;

public class StringGradeEX1_1 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
        int basic = price - discountService.discount(StringGrade.BASIC,price);
        int gold = price - discountService.discount(StringGrade.GOLD,price);
        int diamond = price - discountService.discount(StringGrade.DIAMOND,price);

        System.out.println(basic);
        System.out.println(gold);
        System.out.println(diamond);

    }
}
