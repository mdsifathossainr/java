public class ElseIf {
    public static void main(String[] args) {

        int marks = 75;

        if (marks >= 80) {
            System.out.println("Grade: A+");
        } else if (marks >= 70) {
            System.out.println("Grade: A");
        } else if (marks >= 60) {
            System.out.println("Grade: B");
        } else if (marks >= 50) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }
    }
}