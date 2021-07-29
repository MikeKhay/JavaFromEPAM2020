package chapter1Introduction.optionA.tack5;

import java.util.Scanner;

public class SumNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write number 1 :");
        int num1 = scanner.nextInt();
        System.out.println("Write number 2 :");
        int num2 = scanner.nextInt();
        System.out.println("Sum = " + (num1 + num2));
    }
}
