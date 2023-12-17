package org.example;

public class Praktikum {

    public static boolean result;

    public static void main(String[] args) {
        /*
             В этом методе заложи логику работы с классом Account.
             Нужно создать экземпляр класса Account: в качестве аргумента передать тестируемое имя
             и вызвать метод, который проверяет, можно ли использовать фамилию и имя для печати на банковской карте.
         */
        if (args.length > 0) {
        Account account = new Account(args[0]);
        result = account.checkNameToEmboss();
    }
    }

}