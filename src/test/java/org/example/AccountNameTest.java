package org.example;

import org.example.Praktikum;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class AccountNameTest {

    private final String accountName;
    private final boolean expectedResult;

    public AccountNameTest(String accountName, boolean expectedResult) {
        this.accountName = accountName;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Object[][] data() {
        return new Object[][] {
                {"Аб", false},
                {"Здесь больше девятнадцати символов", false},
                {"А А", true}
        };
    }

    @Test
    public void checkAccountName() {
        Praktikum.main(new String[] {accountName});
        Assert.assertEquals(expectedResult, Praktikum.result);
    }

}
