package com.studies.javaoneforall.utility.wrapper.test;

public class WrapperTest01 {
    public static void main(String[] args) {
        //autoboxing
        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1;
        Long longW = 10L;
        Float floatW = 10F;
        Double doubleW = 100D;
        Character charW = 'W';
        Boolean booleanW = false;

        //unboxing
        byte byteP = byteW;
        short shortP = shortW;
        int intP = intW;
        long longP = longW;
        float floatP = floatW;
        double doubleP = doubleW;
        char charP = charW;
        boolean booleanP = booleanW;

        // wrapper's static methods
        System.out.println(Character.isDigit(charP));

    }
}
