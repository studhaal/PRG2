/* Copyright 2014 Hochschule Luzern - Technik & Architektur */

package ch.hslu.ta.prg2.sw1;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Tests of all linked list methode except print().
 * @author Peter Sollberger <peter.sollberger@hslu.ch>
 */
public class LinkedListTest
{
    
    public LinkedListTest()
    {        
    }

    @Test
    public void testContains()
    {
        LinkedList<String> l = new LinkedList<>();
        
        assertEquals(0, l.getNbrElements());
        assertFalse(l.contains("Hello"));
        assertFalse(l.contains("world"));
        
        l.insert("Hello");
        assertEquals(1, l.getNbrElements());
        assertTrue(l.contains("Hello"));
        assertFalse(l.contains("world"));
        
        l.insert("world");
        assertEquals(2, l.getNbrElements());
        assertTrue(l.contains("Hello"));
        assertTrue(l.contains("world"));
    }
    
    @Test
    public void testgetElementAt()
    {
        LinkedList<String> l = new LinkedList<>();
        
        assertEquals(null, l.getElementAt(0));
        
        l.insert("Hello");  // index 2
        l.insert("nice");   // index 1
        l.insert("world");  // index 0
        assertEquals(3, l.getNbrElements());
        
        assertEquals(null, l.getElementAt(-1));
        assertEquals("world", l.getElementAt(0));
        assertEquals("nice", l.getElementAt(1));
        assertEquals("Hello", l.getElementAt(2));
        assertEquals(null, l.getElementAt(4));        
    }
    
    @Test
    public void testRemove()
    {
        LinkedList<String> l = new LinkedList<>();
        
        l.insert("Hello");      // index 4
        l.insert("wonderful");  // index 3
        l.insert("nice");       // index 2
        l.insert("pretty");     // index 1
        l.insert("world");      // index 0        
        assertEquals(5, l.getNbrElements());
        
        l.remove("not");
        assertEquals(5, l.getNbrElements());

        // Remove at begin of list
        assertTrue(l.contains("world"));
        l.remove("world");    
        assertFalse(l.contains("world"));
        assertEquals(4, l.getNbrElements());
        assertEquals("pretty", l.getElementAt(0));
        
        // Remove at end of list
        assertTrue(l.contains("Hello"));
        l.remove("Hello");
        assertFalse(l.contains("Hello"));
        assertEquals(3, l.getNbrElements());
        assertEquals("wonderful", l.getElementAt(2));
        
        // Remove at middle of list
        assertTrue(l.contains("nice"));
        l.remove("nice");
        assertFalse(l.contains("nice"));
        assertEquals(2, l.getNbrElements());
        assertEquals("wonderful", l.getElementAt(1));
        assertEquals("pretty", l.getElementAt(0));
    }
}
