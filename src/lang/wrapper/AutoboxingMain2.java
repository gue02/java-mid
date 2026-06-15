package lang.wrapper;

public class AutoboxingMain2 {
    public static void main(String[] args){
        int value = 7;
        Integer boxedValue = value;

        int unboxedValue = boxedValue;

        System.out.println(boxedValue);
        System.out.println(unboxedValue);
    }
}
