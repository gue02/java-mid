package generic.ex4;

public class MethodMain1 {
    public static void main(String[] args) {
        Integer i = 1;
        Object obj = GenericMethod.objMethod(1);

        //타입 인자(Type Argument) 명시적 전달.
        System.out.println("명시적 타입 인자 전달");
        Integer result = GenericMethod.genericMethod(i);
        Integer integerValue = GenericMethod.genericMethod(10);
        Double doubleValue = GenericMethod.genericMethod(10.5);

    }
}
