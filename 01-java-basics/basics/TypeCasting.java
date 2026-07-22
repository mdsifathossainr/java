package basics;

public class TypeCasting {
    public static void main(String[] args) {

        // Widening Type Casting (Automatic)
        char ch = 'a';
        int value = ch;

        System.out.println("Widening Type Casting:");
        System.out.println(value);


        // Narrowing Type Casting (Manual)
        int num = 97;
        char val = (char) num;

        System.out.println("Narrowing Type Casting:");
        System.out.println(val);
    }
}