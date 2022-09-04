package com.studies.javaoneforall.innerclass.test;

public class OuterClassesTest03 {
    private String name = "Monkey D. Luffy";
    static class Inner {
        public void printOuterClassAttribute() {
            System.out.println(new OuterClassesTest03().name);
        }
    }

    public static void main(String[] args) {
        Inner inner = new Inner();
        inner.printOuterClassAttribute();
    }
}
