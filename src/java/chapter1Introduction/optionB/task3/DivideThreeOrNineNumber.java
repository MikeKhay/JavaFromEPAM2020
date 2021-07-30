package chapter1Introduction.optionB.task3;

import java.util.Random;

public class DivideThreeOrNineNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int number;
        for (int i = 0; i < 100; i++){
            number = random.nextInt(100);
            if(number % 3 == 0 || number % 9 == 0){
                System.out.println("This number : " + number + " divide on 3 or 9.");
            }
        }
    }
}
