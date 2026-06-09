package lang.string.Equals;

public class StringEqualsMain1 {
    public static void main(String[] args) {
        String string1 = new String("hello");
        String string2 = new String("hello");

        System.out.println(string1 == string2);
        System.out.println(string1.equals(string2));
        //false, true

        String str3 = "hello";
        String str4 = "hello";
        System.out.println(str3 == str4);
        System.out.println(str3.equals(str4));
        //true, true

    }
}
