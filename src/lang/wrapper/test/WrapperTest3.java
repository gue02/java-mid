package lang.wrapper.test;

public class WrapperTest3 {
    public static void main(String[] args) {
        String str = "100";
        System.out.println(str);

        Integer int1 = Integer.valueOf(str);
        System.out.println(int1);

        int int2 = int1.intValue();
        System.out.println(int2);

        Integer int3 = Integer.valueOf(int2);
        System.out.println(int3);
    }
}
