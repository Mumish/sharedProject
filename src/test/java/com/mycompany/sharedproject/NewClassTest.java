/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sharedproject;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mumish
 */
public class NewClassTest {
    
    public NewClassTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class NewClass.
     */
    @org.junit.Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        NewClass.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of methodAnd method, of class NewClass.
     */
    @org.junit.Test
    public void testMethodAnd() {
        System.out.println("methodAnd");
        NewClass instance = new NewClass();
        instance.methodAnd();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of conflicSpace method, of class NewClass.
     */
    @org.junit.Test
    public void testConflicSpace() {
        System.out.println("conflicSpace");
        int a = 0;
        int b = 0;
        NewClass instance = new NewClass();
        int expResult = 0;
        int result = instance.conflicSpace(a, b);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
