package enumeration.ex2;

public class StringGradeEX2_1 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
        int basic = price - discountService.discount(ClassGrade.BASIC,price);
        int gold = price - discountService.discount(ClassGrade.GOLD,price);
        int diamond = price - discountService.discount(ClassGrade.DIAMOND,price);

        System.out.println(basic);
        System.out.println(gold);
        System.out.println(diamond);

    }
}
