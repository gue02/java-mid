package enumeration.ref2;

public class EnumRefMain3 {
    public static void main(String[] args) {
        int price = 10000;
        Grade[] grades = Grade.values();
        for (Grade grade : grades){
            printDiscount(grade,price);
        }

    }

    private static void printDiscount(Grade grade, int price){
        System.out.println(grade.name() + ": " + (price - grade.discount(price)));
    }
}
