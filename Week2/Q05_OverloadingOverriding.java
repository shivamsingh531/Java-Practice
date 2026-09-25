class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

class Animal {

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Q05_OverloadingOverriding {
    public static void main(String[] args) {

        // Method Overloading
        Calculator c = new Calculator();

        System.out.println("Sum of two numbers: " + c.add(10, 20));
        System.out.println("Sum of three numbers: " + c.add(10, 20, 30));

        // Method Overriding
        Dog d = new Dog();
        d.sound();
    }
}