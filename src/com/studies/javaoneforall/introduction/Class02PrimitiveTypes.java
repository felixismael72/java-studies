package com.studies.javaoneforall.introduction;

public class Class02PrimitiveTypes {
    public static void main(String[] args) {
        // int, double, float, boolean, char, byte, short, long
        byte maxByte = 127;
        short maxShort = 32767;
        int maxInt = 2147483647;
        long maxLong = 9223372036854775807L;
        float maxFloat = 3.40282347e+38F;
        double maxDouble = 1.79769313486231570e+308;
        boolean trueValue = true;
        boolean falseValue = false;
        char maxCharacter = '\uffff';

        System.out.println("--- Valores máximos ---");
        System.out.println("byte: "+maxByte);
        System.out.println("short: "+maxShort);
        System.out.println("int: "+maxInt);
        System.out.println("long: "+maxLong);
        System.out.println("float: "+maxFloat);
        System.out.println("double: "+maxDouble);
        System.out.println("char: "+maxCharacter);

        System.out.println();
        System.out.println("--- Boolean ---");
        System.out.println("boolean options: "+trueValue+" "+falseValue);

        System.out.println();
        // cast
        float quotientBefore = 3/2;
        float quotientAfter = (float) 3 / 2;

        System.out.println("--- Cast ---");
        System.out.println("Quociente sem cast: "+quotientBefore);
        System.out.println("Quociente após um cast: "+quotientAfter);
    }
}
