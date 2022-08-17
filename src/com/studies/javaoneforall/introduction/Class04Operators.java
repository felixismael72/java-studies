package com.studies.javaoneforall.introduction;

public class Class04Operators {
    public static void main(String[] args) {
        // + - / * %
        int number01 = 10;
        int number02 = 20;

        System.out.println("--- Operadores aritméticos ---");
        System.out.println("subtração: " + (number01 - number02));
        System.out.println("adição: " + (number01 + number02));
        System.out.println("multiplicação: " + (number01 * number02));
        System.out.println("divisão: " + ((double) number01 / number02));
        System.out.println("resto: " + (number01 % number02));

        System.out.println();
        // < > <= >= != ==

        System.out.println("--- Operadores Relacionais ---");
        System.out.println("Dez é menor que vinte? " + (10 < 20));
        System.out.println("Dez é maior que vinte? " + (10 > 20));
        System.out.println("Dez é menor ou igual a vinte? " + (10 <= 20));
        System.out.println("Dez é maior ou igual a vinte? " + (10 >= 20));
        System.out.println("Dez é diferente de vinte? " + (10 != 20));
        System.out.println("Dez é igual a vinte? " + (10 == 20));

        System.out.println();
        // && (AND), || (OR), ! (NOT)

        int age = 29;
        float salary = 3500F;
        boolean isLegalOlderThanThirty = age >= 30 && salary >= 4612;
        boolean isLegalYoungerThanThirty = age < 30 && salary >= 3381;

        System.out.println("--- Operadores Lógicos ---");
        System.out.println("Legalizado e maior de 30 anos: " + isLegalOlderThanThirty);
        System.out.println("Legalizado e menor de 30 anos: " + isLegalYoungerThanThirty);

        double currentAccount = 299;
        double savingsAccount = 3000;
        float playstationFivePrice = 500;
        boolean canBeBought = currentAccount > playstationFivePrice || savingsAccount > playstationFivePrice;

        System.out.println("Tenho dinheiro em alguma das contas pra o PS5? " + canBeBought);

        System.out.println();
        // = += -= *= /= %=

        double bonus = 1800;
        bonus = 2000;

        System.out.println("--- Operadores de atribuição ---");
        System.out.println("Valor atribuído com = : " + bonus);
        bonus += 1000;
        System.out.println("Atribuindo 1000 com += : " + bonus);
        bonus -= 1000;
        System.out.println("Atribuindo 1000 com -= : " + bonus);
        bonus *= 2;
        System.out.println("Atribuindo 2 com *= : " + bonus);
        bonus /= 2;
        System.out.println("Atribuindo 2 com /= : " + bonus);
        bonus %= 2;
        System.out.println("Atribuindo 2 com %= : " + bonus);

        // Unary ++ --
        int count = 0;
        System.out.println("Usando ++ pós-posto com valor 0: "+ count++);
        System.out.println("Usando -- pós-posto com valor 1: "+ count--);
        System.out.println("Usando ++ pré-posto com valor 0: "+ ++count);
        System.out.println("Usando -- pré-posto com valor 1: "+ --count);
    }
}
