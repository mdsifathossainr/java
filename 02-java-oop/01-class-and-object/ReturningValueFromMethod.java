class Calculator {

    int square(int number) {
        return number * number;
    }
}

public class ReturningValueFromMethod {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        int number = 5;
        int square = calculator.square(number);

        System.out.println("Number : " + number);
        System.out.println("Square : " + square);
    }
}