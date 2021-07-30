package chapter1Introduction.optionB.task6;

import java.util.Random;

public class PrintNumber {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 30; i++){
            System.out.println(random.nextInt(100));
        }
    }
}
