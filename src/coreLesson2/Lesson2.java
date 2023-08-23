package coreLesson2;

import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c;

        c = b * a * (a + b) / Math.pow(a, 2);
        System.out.println(c);

        System.out.println(Math.pow(a, 3) > Math.pow(b, 2));
    }
}
