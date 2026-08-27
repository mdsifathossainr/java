class Person {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

public class GetterAndSetter {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("Sifat");
        p1.setAge(21);

        System.out.println("Name : " + p1.getName());
        System.out.println("Age : " + p1.getAge());
    }
}