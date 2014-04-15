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
public class Ringbuffer {

    private int size;
    private int nbrElt = 0;
    private int head = 0;
    private int tail = 0;
    private Object[] queue;

    public Ringbuffer(int s) {
        size = s;
        queue = new Object[size];
        tail = s - 1;
    }

    public void enqueue(Object o) {
        nbrElt++;
        if (isFull() == false) {
            queue[head] = o;
            head++;
            head = head % size;
            System.out.println("Etwas hinzugefügt");
            System.out.println("Head= " + head);
            System.out.println("--------");
        } else {
            System.out.println("Queue ist voll");
        }
    }

    public Object dequeue() {
        nbrElt--;
        if (isEmpty() == false) {
            Object o = queue[tail];
            tail++;
            tail = tail % size;
            System.out.println("Etwas entfernt");
            System.out.println("Tail= " + tail);
            System.out.println("---------");
            return o;
        } else {
            System.out.println("Queue bereits leer");
            return null;
        }
    }

    public boolean isEmpty() {
        return (nbrElt == 0);
    }

    public boolean isFull() {
        return (nbrElt == size);
    }
}
