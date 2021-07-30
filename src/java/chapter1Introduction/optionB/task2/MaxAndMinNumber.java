package chapter1Introduction.optionB.task2;

import java.util.Random;

public class MaxAndMinNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int number;
        int max = 0;
        int min = 100;
        for (int i = 0; i < 30; i++){
            number = random.nextInt(1000);
            if(max < number)
                max = number;

            if(min > number)
                min = number;
        }

        System.out.println("Max number : " + max);
        System.out.println("Min number : " + min);
    }
}
