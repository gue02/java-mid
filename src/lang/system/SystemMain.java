package lang.system;

import java.util.Arrays;

public class SystemMain {
    public static void main(String[] args) {
        //현재 시간 기억
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println(currentTimeMillis);
        //현재 시간 기억(나노초)
        long currentTimeNano = System.nanoTime();
        System.out.println(currentTimeNano);
        //환경 변수 읽기
        System.out.println(System.getenv());
        //시스템 속성 읽기
        System.out.println(System.getProperties());
        System.out.println(System.getProperty("java.version"));

        //배열 고속 복사
        char[] originalArray = new char[]{'h','e','l','l','o'};
        char[] copiedArray = new char[5];
        System.arraycopy(originalArray,0,copiedArray,0,originalArray.length);
        System.out.println(copiedArray);
        System.out.println(Arrays.toString(copiedArray));
    }
}
