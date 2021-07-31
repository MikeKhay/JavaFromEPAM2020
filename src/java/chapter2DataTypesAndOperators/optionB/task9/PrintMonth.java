package chapter2DataTypesAndOperators.optionB.task9;

import java.util.Scanner;

public class PrintMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the number : (1-12)    . Finish( 0 )");
            switch (scanner.nextInt()){
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    System.out.println(Month.JANUARY);
                    break;

                case 2:
                    System.out.println(Month.FEBRUARY);
                    break;

                case 3:
                    System.out.println(Month.MARCH);
                    break;

                case 4:
                    System.out.println(Month.APRIL);
                    break;

                case 5:
                    System.out.println(Month.MAY);
                    break;

                case 6:
                    System.out.println(Month.JUNE);
                    break;

                case 7:
                    System.out.println(Month.JULY);
                    break;

                case 8:
                    System.out.println(Month.AUGUST);
                    break;

                case 9:
                    System.out.println(Month.SEPTEMBER);
                    break;

                case 10:
                    System.out.println(Month.OCTOBER);
                    break;

                case 11:
                    System.out.println(Month.NOVEMBER);
                    break;

                case 12:
                    System.out.println(Month.DECEMBER);
                    break;

                default:
                    System.out.println("Number isn't true. needs(1-12)");
            }

        }
    }
}
