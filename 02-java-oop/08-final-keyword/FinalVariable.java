class University{
    
    //final means the variable's value cannot be changed after it is assigned.
    final String UNIVERSITY_NAME = "PSTU";

}
public class FinalVariable {
    public static void main(String[]args)
    {
        University obj = new University();
        System.out.println("University : " + obj.UNIVERSITY_NAME);
    }
}
