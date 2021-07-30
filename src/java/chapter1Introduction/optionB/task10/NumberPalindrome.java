package chapter1Introduction.optionB.task10;

import java.util.Random;

public class NumberPalindrome {
    public static void main(String[] args) {
        Random random = new Random();
        String number;

        for (int i = 0; i < 500; i++){
            number = Integer.toString(random.nextInt(990) + 10);
            StringBuilder s = new StringBuilder(number);
            if(s.toString().equals(s.reverse().toString())){
                System.out.println("This number is palindrome : " + s.toString());
            }
        }
    }
}
