package coreLesson8;

public class Main {
    public static void main(String[] args) {
        Counter evenCounter = new Counter("even");
        Counter oddCounter = new Counter("odd");

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0)
                evenCounter.increaseCounter();
            else
                oddCounter.increaseCounter();
        }

        System.out.println("Четные числа: " + evenCounter.getCount());
        System.out.println("Нечетные числа: " + oddCounter.getCount());
    }
}
