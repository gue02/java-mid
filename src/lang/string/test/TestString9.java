package lang.string.test;

public class TestString9 {
    public static void main(String[] args) {
        String email = "hello@example.com";
        String[] email1 = email.split("@");
        System.out.println(email1[0]);
        System.out.println(email1[1]);
    }
}
