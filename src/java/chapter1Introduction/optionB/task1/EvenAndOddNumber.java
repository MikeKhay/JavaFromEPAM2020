package chapter1Introduction.optionB.task1;

import java.util.Random;

public class EvenAndOddNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int number;

        for (int i = 0; i < 30; i++){
            number = random.nextInt(1000);
            if(number % 2 == 0){
                System.out.println("Number : " + number + " is even number.");
            }
            else {
                System.out.println("Number : " + number + " is odd number.");
            }
        }
    }
}
