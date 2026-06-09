package lang.string.Equals;

public class StringEqualsMain2 {
    public static void main(String[] args) {
        String string1 = new String("hello");
        String string2 = new String("hello");

        System.out.println(isSame(string1, string2));

        String str3 = "hello";
        String str4 = "hello";
        System.out.println(isSame(str3, str4));

    }
    private static boolean isSame(String x, String y){
        return x == y;
    }
}
