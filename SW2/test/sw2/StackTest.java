/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sw2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author studhaal
 */
public class StackTest {
    
    public StackTest() {
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
     * Test of push method, of class Stack.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        String d = "Push";
        Stack instance = new Stack();
        instance.push(d);
        assertEquals(false,instance.isEmpty());
    }

    /**
     * Test of pop method, of class Stack.
     */
    @Test
    public void testPop() {
        System.out.println("pop");
        Stack instance = new Stack();
        String d = "Pop";
        Object expResult = "Pop";
        instance.push(d);
        System.out.println("Pop in Stack eingefügt");
        assertEquals(false,instance.isEmpty());
        Object result = instance.pop();
        assertEquals(expResult, result);
        System.out.println("Pop wieder ausgelesen, Stack leer");
        assertEquals(true,instance.isEmpty());
    }

    /**
     * Test of isEmpty method, of class Stack.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        Stack instance = new Stack();
        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
    }

    /**
     * Test of isFull method, of class Stack.
     */
    @Test
    public void testIsFull() {
        System.out.println("isFull");
        Stack instance = new Stack();
        boolean expResult = false;
        boolean result = instance.isFull();
        assertEquals(expResult, result);
    }
    
}
