package enumeration.ref1;

public class ClassRefMain1 {
    public static void main(String[] args) {
        System.out.println("class BASIC = " +  enumeration.ex2.ClassGrade.BASIC.getClass());
        System.out.println("class GOLD = " +  enumeration.ex2.ClassGrade.GOLD.getClass());
        System.out.println("class DIAMOND = " +  enumeration.ex2.ClassGrade.DIAMOND.getClass());
        System.out.println();

        System.out.println("ref BASIC = " + enumeration.ex2.ClassGrade.BASIC);
        System.out.println("ref GOLD = " + enumeration.ex2.ClassGrade.GOLD);
        System.out.println("ref DIAMOND = " + ClassGrade.DIAMOND);

    }
}
