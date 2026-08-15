class Student {

    // Instance variable
    String batchName = "Nobospuron";

    // Static variable
    static String universityName = "Patuakhali Science and Technology University";
}

public class StaticVariableII {
    public static void main(String[] args) {

        Student s1 = new Student();

        System.out.println("Batch Name : " + s1.batchName);
        System.out.println("University Name : " + Student.universityName);
    }
}