/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sw2;

/**
 *
 * @author studhaal
 */
public class SW2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ringbuffer r = new Ringbuffer(5);
        r.enqueue(null);
        r.enqueue(null);
        r.enqueue(null);
        r.enqueue(null);
        r.enqueue(null);
        r.enqueue(null);
        Object o = new Object();
        o = r.dequeue();
        o = r.dequeue();
        o = r.dequeue();
        o = r.dequeue();
        o = r.dequeue();
        o = r.dequeue();
    }
    
}
