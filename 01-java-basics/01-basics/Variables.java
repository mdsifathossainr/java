public class Variables {
    public static void main(String[] args) {

        int year = 2025;
        double price = 19.99;
        char symbol = '$';
        boolean available = false;

        String model = "Toyota Supra";
        String color = "Blue";

        System.out.println("Car: " + year + " " + color + " " + model);
        System.out.println("Price: " + symbol + price);

        if (available) {
            System.out.println("Available");
        } else {
            System.out.println("Not available");
        }
    }
}