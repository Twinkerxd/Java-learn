package someRandomStuff;

public class MyClass {

    public static void main(String[] args) {
        String a = "kek";
        String b = "kek ";

        System.out.println(method(a,b));
    }

    public static int method(String a, String b) {
        return a.equals(b) ? 1 : 0;
    }
}
