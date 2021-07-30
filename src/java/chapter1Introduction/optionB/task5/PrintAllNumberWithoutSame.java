package chapter1Introduction.optionB.task5;

import java.util.Random;

public class PrintAllNumberWithoutSame {
    public static void main(String[] args) {
        Random random = new Random();
        int number;
        int n1, n2, n3;
        for( int i = 0; i < 100; i++){
            number = (random.nextInt(900) + 100);

            n3 = number % 10;
            if(number % 100 >= 10){
                n2 = ((number % 100) - n3) / 10;
            }
            else {
                n2 = 0;
            }
            n1 = (number - (n2 * 10) + n3) / 100;

            if ((n1 != n2) && (n2 != n3) && (n1 != n3)){
                System.out.println(number);
            }
        }
    }
}
