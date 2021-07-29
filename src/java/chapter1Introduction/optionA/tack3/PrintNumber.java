package chapter1Introduction.optionA.tack3;

import java.util.Random;

public class PrintNumber {
    public static void main(String[] args) {
        Random random = new Random(47);
        for (int i = 0; i < 10; i++)
            System.out.println(random.nextInt(100));

        for (int i = 0; i < 10; i++)
            System.out.print(random.nextInt(100) + ", ");
    }
}
