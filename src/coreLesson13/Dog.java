package coreLesson13;

public class Dog extends Animal {
    private Dog() {
        System.out.println("I'm a dog");
    }

    public Dog(String color) {
        System.out.println("I'm a " + color + " dog");
    }
}
