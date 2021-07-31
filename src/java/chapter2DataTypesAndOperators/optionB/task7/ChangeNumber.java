package chapter2DataTypesAndOperators.optionB.task7;

public class ChangeNumber {
    public static void main(String[] args) {

        int num = 3044;

        String s = Integer.toBinaryString(num);
        long i = Long.decode(s);
        System.out.println("Converting: " + num + " from decimal to binary: " + i);

        System.out.println("Converting: " + num + " from decimal to octal: " + Integer.toOctalString(num));

        System.out.println("Converting: " + num + " from decimal to octal: " + Integer.toHexString(num));

    }
}
