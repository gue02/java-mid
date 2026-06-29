package lang.clazz;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassMetaMain {
    public static void main(String[] args) {
        Class clazz = String.class;
        //Class clazz = new String().getClass(); //인스턴스 조회
        //Class clazz = Class.forName("java.lang.String"); // 문자열로 조회

        // 모든 필드 출력이 가능
        Field[] fields = clazz.getDeclaredFields();
        for(Field field : fields){
            System.out.println(field.getType() + " "+ field.getName());
        }

        Method[] methods = clazz.getDeclaredMethods();
        for(Field field : fields){
            System.out.println(methods);
        }

        //상위 클래스 정보 출력
        System.out.println(clazz.getSuperclass().getName());

        //인터페이스 정보 출력
        Class[] interfaces = clazz.getInterfaces();
        for(Class i: interfaces){
            System.out.println(i.getName());
        }
    }
}
