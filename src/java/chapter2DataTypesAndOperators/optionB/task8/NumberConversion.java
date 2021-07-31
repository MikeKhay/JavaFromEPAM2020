package chapter2DataTypesAndOperators.optionB.task8;

import java.util.Scanner;

public class NumberConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select an item : ");
        System.out.println("1: binary -> other\n" +
                "2: octal -> other\n" +
                "3: decimal -> other\n" +
                "4: hexadecimal -> other\n");

        int option = scanner.nextInt();
        System.out.println("Enter the number: ");


        switch (option){
            case 1:

                TransformNumber.binaryToOther(scanner.nextInt());
                break;

            case 2:
                TransformNumber.octalToOther(scanner.nextInt());
                break;

            case 3:
                TransformNumber.decimalToOther(scanner.nextInt());
                break;

            case 4:
                TransformNumber.hexadecimalToOther(scanner.next());
                break;

            default:
                System.out.println("This number hasn't in switch.");
        }
    }
}
