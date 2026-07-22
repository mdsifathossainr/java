public class LogicalOperators {
    public static void main(String[] args) {

        System.out.println(5 > 2 && 6 > 5); // Logical AND
        System.out.println(5 > 2 && 6 < 5);

        System.out.println(5 > 2 || 5 == 6); // Logical OR

        System.out.println(!true); // Logical NOT
        System.out.println(!(5 < 2));
    }
}
