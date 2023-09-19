package coreLesson13;

public class Cow extends Animal{
    public static final String COW_TYPE = "Cow";

    public Cow() {
        super(COW_TYPE, "moo");
    }

    public void moo() {
        sound();
    }
}
