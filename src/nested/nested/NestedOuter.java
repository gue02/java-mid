package nested.nested;

public class NestedOuter {

    private static int outClassValue = 3;
    private int outInstanceValue = 2;

    static class Nested{
        private int nestedInstanceValue = 1;

        public void print(){
            System.out.println(nestedInstanceValue); // 본인의 멤버 변수

            //System.out.println(outInstanceValue); 바깥 클래스의 인스턴스 멤버는 접근 불가.

            System.out.println(outClassValue); // 바깥 클래스의 클래스 멤버는 가능. private여도 상관 없다.
        }
    }
}
