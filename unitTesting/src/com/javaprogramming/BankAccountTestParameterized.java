package com.javaprogramming;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class BankAccountTestParameterized {

    private BankAccount account;
    private double amount;
    private boolean branch;
    private double expected;

    public BankAccountTestParameterized(double amount, boolean branch, double expected) {
        this.amount = amount;
        this.branch = branch;
        this.expected = expected;
    }

    @org.junit.Before
    public void setup(){
        account=new BankAccount("Sai","Ashish",1000.00);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testConditions(){
        return Arrays.asList(new Object[][]{
                {100.00,true,1100},
                {200,true,1200},
                {325,true,1328}
        });
    }

    @org.junit.Test
    public void deposit() throws  Exception {

        account.deposit(amount,branch);
        assertEquals(expected,account.getBalance(),5);
//delta +-5

    }

}
