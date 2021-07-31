package chapter2DataTypesAndOperators.optionB.task2;

import java.util.Arrays;
import java.util.Random;

public class SortArray {
    public static void main(String[] args) {
        Random random = new Random();
        int size = 20;
        int array[] = new int[size];

        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(100);
        }


        boolean isSorted = false;
        while (!isSorted){
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++){
                if (array[i] < array[i + 1]){
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    isSorted = false;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
