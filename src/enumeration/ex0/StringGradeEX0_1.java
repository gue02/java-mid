package enumeration.ex0;

public class StringGradeEX0_1 {
    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
        int basic = price - discountService.discount("BASIC",price);
        int gold = price - discountService.discount("GOLD",price);
        int diamond = price - discountService.discount("DIAMOND",price);

        System.out.println(basic);
        System.out.println(gold);
        System.out.println(diamond);

    }
}
