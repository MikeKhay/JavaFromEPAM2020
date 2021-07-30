package chapter1Introduction.optionB.task4;

import java.util.Random;

public class DivideFiveAndSevenNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int number;
        for (int i = 0; i < 500; i++){
            number = random.nextInt(1000);
            if(number % 5 == 0 && number % 7 == 0){
                System.out.println("This number : " + number + " divide on 5 and 7.");
            }
        }
    }
}
