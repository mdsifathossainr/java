public class UnaryOperators {
    public static void main(String[] args) {
        // pre increment

        int a = 5;
        int b = ++a;

        System.out.println(a); // 6
        System.out.println(b); // 6

        // post increment

        int c = 5;
        int d = c++;

        System.out.println(c); // 6
        System.out.println(d); // 5

        // pre decrement

        int e = 5;
        int f = --e;

        System.out.println(e); // 4
        System.out.println(f); // 4

        // post decrement

        int g = 5;
        int h = g--;

        System.out.println(g); // 4
        System.out.println(h); // 5
    }
}
