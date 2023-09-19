package coreLesson13;

public class Dog extends Animal {
    public static final String DOG_TYPE = "Dog";

    public Dog() {
        super(DOG_TYPE, "woof");
    }

    public void woof() {
        sound();
    }
}
