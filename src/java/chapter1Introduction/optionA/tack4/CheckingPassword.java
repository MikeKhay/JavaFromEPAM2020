package chapter1Introduction.optionA.tack4;

import java.util.Scanner;

public class CheckingPassword {
    public static void main(String[] args) {

        String truePassword = "1234";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write password : ");

        String writePassword = scanner.nextLine();

        if(writePassword.equals(truePassword))
            System.out.println("Password is true.");
        else System.out.println("Password is false.");
    }
}
