// Problem 1: Write a Java program to create an Animal class with a makeSound() method
// and a Cat subclass that overrides makeSound() to meow.

class Animal {

    void makeSound() {
        System.out.println("Animal Sound");
    }
}

class Cat extends Animal {

    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

public class Problem1 {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.makeSound();
    }
}