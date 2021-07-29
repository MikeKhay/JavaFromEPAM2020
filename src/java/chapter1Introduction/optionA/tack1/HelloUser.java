package chapter1Introduction.optionA.tack1;

import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        System.out.println("Write you name : ");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println("Hello " + s + " )))");
    }
}
