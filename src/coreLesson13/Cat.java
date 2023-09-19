package coreLesson13;

public class Cat extends Animal {
    public static final String CAT_TYPE = "Cat";

    public Cat() {
        super(CAT_TYPE, "meow");
    }

    public void meow() {
        sound();
    }
}
