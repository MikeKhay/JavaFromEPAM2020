package chapter1Introduction.optionA.tack6;

import java.util.Scanner;

public class PrintInformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write last name developer : ");
        String lastName = scanner.nextLine();
        System.out.println("Write date(xx:xx:xxxx) and time(xx:xx) get task :");
        System.out.println("Day : ");
        int day = scanner.nextInt();
        System.out.println("Month : ");
        int month = scanner.nextInt();
        System.out.println("Year : ");
        int year = scanner.nextInt();
        System.out.println("Hour : ");
        int hour = scanner.nextInt();
        System.out.println("Minute");
        int minute = scanner.nextInt();
        System.out.println("Information when get task last name developer : " + lastName + " , Date : " + hour + ":"
                + minute + " o'clock, " + day + ":" + month + ":" + year + " year.");

        System.out.println();
        System.out.println("Write date when pass the task : ");
        System.out.println("Day : ");
        int dayPass = scanner.nextInt();
        System.out.println("Month : ");
        int monthPass = scanner.nextInt();
        System.out.println("Year : ");
        int yearPass = scanner.nextInt();
        System.out.println("Hour : ");
        int hourPass = scanner.nextInt();
        System.out.println("Minute");
        int minutePass = scanner.nextInt();
        System.out.println("Date when pass the task : " + hour + ":"
                + minute + " o'clock, " + day + ":" + month + ":" + year + " year.");
    }
}

