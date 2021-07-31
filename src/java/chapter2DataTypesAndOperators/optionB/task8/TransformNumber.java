package chapter2DataTypesAndOperators.optionB.task8;

public class TransformNumber {
    public static int binaryToDecimal(int i){
        return Integer.parseInt(Integer.toString(i), 2);
    }

    public static int octalToDecimal(int i){
        return Integer.parseInt(Integer.toString(i), 8);
    }

    public static int hexadecimalToDecimal(String i){
        return Integer.parseInt(i, 16);
    }

    public static void binaryToOther(int i){
        System.out.println("Binary -> Octal =       " + Integer.toOctalString(binaryToDecimal(i)));
        System.out.println("Binary -> Decimal =     " + binaryToDecimal(i));
        System.out.println("Binary -> Hexadecimal = " + Integer.toHexString(binaryToDecimal(i)));
    }

    public static void octalToOther(int i){
        System.out.println("Octal -> Binary =      " + Integer.toBinaryString(octalToDecimal(i)));
        System.out.println("Octal -> Decimal =     " + octalToDecimal(i));
        System.out.println("Octal -> Hexadecimal = " + Integer.toHexString(octalToDecimal(i)));
    }

    public static void decimalToOther(int i){
        System.out.println("Decimal -> Binary =      " + Integer.toBinaryString(i));
        System.out.println("Decimal -> Octal  =      " + Integer.toOctalString(i));
        System.out.println("Decimal -> Hexadecimal = " + Integer.toHexString(i));
    }

    public static void hexadecimalToOther(String i){
        int num = hexadecimalToDecimal(i);
        System.out.println("Hexadecimal -> Binary = " + Integer.toBinaryString(num));
        System.out.println("Hexadecimal -> Octal = " + Integer.toOctalString(num));
        System.out.println("Hexadecimal -> Decimal = " + num);

    }
}
