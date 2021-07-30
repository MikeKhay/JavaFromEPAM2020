package chapter1Introduction.optionB.task7;

import java.util.Arrays;
import java.util.Random;

public class SortNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int size = 30;
        int growth[] = new int[size];

        for (int a = 0; a < size; a++) {
            growth[a] = random.nextInt(1000);
        }

        boolean sortedG = false;
        int tempG;
        while (!sortedG) {
            sortedG = true;
            for (int i = 0; i < growth.length - 1; i++) {
                if (growth[i] > growth[i + 1]) {
                    tempG = growth[i];
                    growth[i] = growth[i + 1];
                    growth[i + 1] = tempG;
                    sortedG = false;
                }
            }
        }
        System.out.println("Array grown : " + Arrays.toString(growth));


        boolean sortedD = false;
        int tempD;
        while (!sortedD) {
            sortedD = true;
            for (int i = 0; i < growth.length - 1; i++) {
                if (growth[i] < growth[i + 1]) {
                    tempD = growth[i];
                    growth[i] = growth[i + 1];
                    growth[i + 1] = tempD;
                    sortedD = false;
                }
            }
        }
        System.out.println("Array decrease : " + Arrays.toString(growth));

    }
}
