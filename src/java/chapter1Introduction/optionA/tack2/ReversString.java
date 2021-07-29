package chapter1Introduction.optionA.tack2;

import java.util.Scanner;

public class ReversString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write text : ");
        String s = scanner.nextLine();
        StringBuilder toll = new StringBuilder(s);
        toll.reverse();
        System.out.println(toll.toString());

    }
}
