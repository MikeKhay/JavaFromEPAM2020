package chapter2DataTypesAndOperators.optionA.task1;

import chapter2DataTypesAndOperators.optionA.DeveloperAndDate;

import java.util.Arrays;
import java.util.Random;

public class SearchShortAndLongNumber {
    public static void main(String[] args) {
        int size = 500;
        int min = 10;
        int max = 0;
        String minStr = null;
        String maxStr = null;
        Random random = new Random();
        String array[] = new String[size];

        for (int i = 0; i < size; i++){
            array[i] = Integer.toString(random.nextInt(100000));
        }

        for(String s : array){
            if(s.length() < min){
                min = s.length();
                minStr = s;
            }
            if(s.length() > max){
                max = s.length();
                maxStr = s;
            }
        }

        System.out.println("Min number : " + minStr + " consists of : " + min + " numbers.");
        System.out.println("Max number : " + maxStr + " consists of : " + max + " numbers.");


        DeveloperAndDate d = new DeveloperAndDate();
        d.setHourGet(14);
        d.setMinuteGet(07);
        d.setDayGet(30);
        d.setMonthGet(07);
        d.setYearGet(2021);
        d.setHourFinish(14);
        d.setMinuteFinish(40);
        d.setDayFinish(30);
        d.setMonthFinish(07);
        d.setYearFinish(2021);
        System.out.println(d.toString());
    }
}
