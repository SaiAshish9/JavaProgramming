package com.javaprogramming;

import org.junit.After;
import org.junit.Before;

import static org.junit.Assert.*;
// File ->  Modules -> Dependencies -> Compile
// add jUnit4 to classpath

public class BankAccountTest {

    private static int count;

    @org.junit.Before
    public void before(){
        System.out.println("before");
    }


    @org.junit.Test
    public void deposit() throws  Exception {
        BankAccount account=new BankAccount("sai","ashish",1000.00);
//        fail("This test is yet to be implemented");
        double balance=account.deposit(200.00,true);
        assertEquals(1200,balance,0);

//        delta -> range (approx)
    }

    @org.junit.Test
    public void withdraw() throws Exception {
//        fail("This test is yet to be implemented");
    }

    @org.junit.Test
    public void getBalance_deposit() throws  Exception {
//        fail("This test is yet to be implemented");
        BankAccount account=new BankAccount("sai","ashish",1000.00);
        account.withdraw(200.00,true);
        assertEquals(800.00,account.getBalance(),0);
        assertFalse(account.getBalance()!=800);
    }

    @org.junit.BeforeClass
    public static void beforeClass(){
        System.out.println(count++);
    }


    @org.junit.AfterClass
    public static void afterClass(){
        System.out.println(count++);
    }



    @org.junit.After
    public void after(){
        System.out.println("after");
    }
//    after unit test is finished




//    assertNotEquals
//    assertArrayEquals
//    assertNull assertNotNull
//    assertTrue assertFalse
//    assertSame assertNotSame
//    assertEquals() uses equals() to test for equality
//    assertSame() compares object references
//    assertThat() compares actual value against a matcher


//  assertions are met when the test passes

//    @org.junit.Test
//    public void dummyTest(){
//      assertEquals(20,21);
//    }



}
// right click -> createBankAccountTest