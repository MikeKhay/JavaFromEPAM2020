package chapter2DataTypesAndOperators.optionA.task2;

import chapter2DataTypesAndOperators.optionA.DeveloperAndDate;

import java.util.Arrays;
import java.util.Random;

public class PrintNumber {
    public static void main(String[] args) {

        int size = 50;

        Random random = new Random();
        String array[] = new String[size];

        for (int i = 0; i < size; i++){
            array[i] = Integer.toString(random.nextInt(100000));
        }

        for (int i = array.length - 1 ; i > 0 ; i--){
            for(int j = 0; j < i ; j++){
                if (array[j].length() > array[j+1].length()){
                    String tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(array));

        for (int i = array.length - 1 ; i > 0 ; i--){
            for(int j = 0; j < i ; j++){
                if (array[j].length() < array[j+1].length()){
                    String tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(array));


        DeveloperAndDate d = new DeveloperAndDate();
        d.setHourGet(14);
        d.setMinuteGet(40);
        d.setDayGet(30);
        d.setMonthGet(07);
        d.setYearGet(2021);
        d.setHourFinish(15);
        d.setMinuteFinish(10);
        d.setDayFinish(30);
        d.setMonthFinish(07);
        d.setYearFinish(2021);
        System.out.println(d.toString());
    }
}
