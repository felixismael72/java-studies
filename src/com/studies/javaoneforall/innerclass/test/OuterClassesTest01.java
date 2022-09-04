package com.studies.javaoneforall.innerclass.test;

public class OuterClassesTest01 {
    private final String name = "Monkey D. Luffy";

    class Inner {
        public void printAttributes() {
            System.out.println(name);
            System.out.println(this);
            System.out.println(OuterClassesTest01.this);
        }
    }

    public static void main(String[] args) {
        OuterClassesTest01.Inner inner = new OuterClassesTest01().new Inner();
        inner.printAttributes();
    }
}
