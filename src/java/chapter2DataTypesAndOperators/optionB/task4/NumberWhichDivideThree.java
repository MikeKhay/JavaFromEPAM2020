package chapter2DataTypesAndOperators.optionB.task4;

public class NumberWhichDivideThree {
    public static void main(String[] args) {
        for (int i = 1 ; i <= 100; i++){
            if(i % 3 == 0){
                System.out.println("This number divide without remainder : " + i);
            }
        }
    }
}
