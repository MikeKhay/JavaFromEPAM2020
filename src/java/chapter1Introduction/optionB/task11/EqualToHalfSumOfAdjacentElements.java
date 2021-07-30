package chapter1Introduction.optionB.task11;

import java.util.Random;

public class EqualToHalfSumOfAdjacentElements {
    public static void main(String[] args) {
        Random random = new Random();

        int size = 1000;
        int array[] = new int[size];

        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(300);
        }

        for (int j = 1; j < array.length - 1; j++){
            if(array[j] == (array[j - 1] + array[j + 1]) / 2){
                System.out.println("Number : " + array[j] + " equal to half the sum of adjacent elements.");
            }
        }
    }
}
