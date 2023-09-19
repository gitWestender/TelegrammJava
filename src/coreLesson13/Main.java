package coreLesson13;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Dog(),
                new Cat(),
                new Cow()
        };

        soundAllAnimals(animals);
    }

    private static void soundAllAnimals(Animal[] animals) {
        for (int i = 0; i < animals.length; i++) {
            animals[i].sound();
        }
    }

    private static void sound(Animal animal) {
        switch (animal.getType()) {
            case Dog.DOG_TYPE -> ((Dog) animal).woof();
            case Cat.CAT_TYPE -> ((Cat) animal).meow();
            case Cow.COW_TYPE -> ((Cow) animal).moo();
            default -> System.out.println("Unknown animal");
        }
    }
}
