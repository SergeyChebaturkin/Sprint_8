package org.example;

import java.util.List;
import java.util.stream.Collectors;

public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }


    // Этот метод проверяет, что сохранённая через конструктор строка соответствует требованиям
    public boolean checkNameToEmboss() {

        String nameCopy = name;
        if (nameCopy.length() < 3 || nameCopy.length() > 19) {
            return false;
        }
        int spaceCount = (int) nameCopy
                .chars()
                .mapToObj(c -> (char) c)
                .filter(Character::isSpaceChar)
                .count();
        if (spaceCount == 0 || spaceCount > 1) {
            return false;
        }
        int charsCount = nameCopy.length();
        int charsCountAfterTrim = nameCopy.trim().length();
        if (charsCount != charsCountAfterTrim) {
            return false;
        }
        return true;
    }

}
