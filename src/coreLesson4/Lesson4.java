package coreLesson4;

import java.util.Scanner;

public class Lesson4 {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
//        task1();
//        task2();
//        task3();
//        task4();
        task5();
    }

    static void task1() {
        System.out.println("Вывод факториала введенного числа");
        int input = scan.nextInt();
        int result = 1;
        for (int i = 0; i < input; i++) {
            result *= (i + 1);
        }
        System.out.printf("Факториал числа %d равен %d", input, result);
    }

    static void task2() {
        System.out.println("\nВывод суммы цифр введеного числа");
        int input = scan.nextInt();
        int result = 0;
        while (input != 0) {
            result += input % 10;
            input /= 10;
        }
        System.out.println(result);
    }

    static void task3() {
        System.out.println("\nРисование заданного прямоугольника");
        int lenght = scan.nextInt();
        int width = scan.nextInt();

        String horizontalLine = " ";
        for (int i = 0; i < lenght; i++) {
            horizontalLine += "-";
        }
        horizontalLine += " \n";

        String verticalLineUnit = "|";
        for (int i = 0; i < lenght; i++) {
            verticalLineUnit += " ";
        }
        verticalLineUnit += "|\n";

        String verticalLines = "";
        for (int i = 0; i < width; i++) {
            verticalLines += verticalLineUnit;
        }

        System.out.println(horizontalLine + verticalLines + horizontalLine);

    }

    static void task4() {
        System.out.println("\nВыполнение условий для введенных чисел");
        int num = scan.nextInt();
        int result;

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                result = i + num;
                System.out.printf("Для числа %d сумма равна %d\n", i, result);
            } else {
                result = i - num;
                System.out.printf("Для числа %d разность равна %d\n", i, result);
            }
            if (num == i) {
                System.out.println("Числа равны");
            }
        }
    }

    static void task5() {
        System.out.println("\nНе угадал! пока не 1");
        int num = scan.nextInt();
// Число запрашивается после вывода на экран
        do {
            System.out.println("Не угадал!");
            num = scan.nextInt();
        } while (num != 1);

// Число запрашивается до вывода на экран
//        while (num != 1) {
//        num = scan.nextInt();
//        System.out.println("Не угадал!");
//        }

    }
}
