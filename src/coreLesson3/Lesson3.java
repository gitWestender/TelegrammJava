package coreLesson3;

import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        String str = scanner.next();

        task1(a, b);
        task2(str);
        task4(a, b);
    }

    static void task1(int a, int b) {
        if (a % 2 == 0) {
            System.out.println(a * b);
        } else {
            System.out.println((double) a / b);
        }
        if (a == b) {
            System.out.println("Числа равны");
        }
    }

    static void task2(String str) {
        switch (str) {
            case "Hi":
                System.out.println("Hello");
                break;
            case "Bye":
                System.out.println("Goodbye");
                break;
            default:
                System.out.println("Unknown message");
        }
    }

    static void task4(int a, int b) {
        if (a % 2 == 0 && a % 3 == 0) {
            int result = (int) Math.pow(a, b);
            if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
                System.out.println("Результат выражения слишком большой!");
            } else {
                System.out.println(result);
            }
        }
    }
}
