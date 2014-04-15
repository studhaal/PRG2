/* Copyright 2014 Hochschule Luzern - Technik & Architektur */
package ch.hslu.ta.prg2.sw1;

/**
 * Implementation of a linked list with generics.
 * @param <T> Type of the data.
 * @author Peter Sollberger <peter.sollberger@hslu.ch>
 */
public class LinkedList<T>
{
    private ListNode<T> head;     // Kopf bzw. Anfang der Liste
    private int nbrElements;

    /**
     * Creates an empty list.
     */
    public LinkedList()
    {
        head = null;
        nbrElements = 0;
    }

    public int getNbrElements()
    {
        return nbrElements;
    }

    /**
     * Checks if list is empty.
     * @return true if no elements in the list.
     */
    public boolean isEmpty()
    {
        return (head == null);
    }

    /**
     * Inserts an element at the head of the list.
     * @param data Element to insert.
     */
    public void insert(T data)
    {
        head = new ListNode<>(head, data);
        nbrElements++;
    }
    
    /**
     * Get the n th element in the list. 
     * @param n Element to return. Element with number 0 is the first element.
     * @return Element at position n in the list or null.
     */
    public T getElementAt(int n)
    {
        if (n < 0) return null;
        
        ListNode<T> actualNode = head;
        int i = 0;
        
        while((i < n) && (actualNode != null)) {
            actualNode = actualNode.getNext();
            i++;
        }
        return (actualNode == null ? null : actualNode.getData());                
    }
    
    /**
     * Checks if the LinkedList contains an equal element.
     * @param data Element to check
     * @return true if the LinkedList contains an equal element.
     */
    public boolean contains(T data)
    {
        ListNode actualNode = head;
        
        while ((actualNode != null) && !data.equals(actualNode.getData())) {
            actualNode = actualNode.getNext();
        }
        return actualNode != null;
    }

    /**
     * Removes the passed data from the list
     * @param d Element value to remove using equals() methode.
     */
    public void remove(T d)
    {
        ListNode<T> actualNode = head;
        ListNode<T> prevNode   = null;
        
        while ((actualNode != null) && !d.equals(actualNode.getData())) {
            prevNode = actualNode;
            actualNode = prevNode.getNext();
        }
        
        // Repair list
        if (actualNode != null) {
            if (actualNode == head) {
                head = actualNode.getNext();
            }
            else {
                prevNode.setNext(actualNode.getNext());
            }
            nbrElements--;
        }
    }

    /**
     * Output the content of the list to the console.
     */
    public void print()
    {
        ListNode<T> actualNode = head;

        System.out.println("----------");
        while (actualNode != null) {
            System.out.println(actualNode.getData());
            actualNode = actualNode.getNext();
        }
    }

    /**
     * Test the list.
     * @param args not used
     */
    public static void main(String[] args)
    {
        LinkedList<Integer> list = new LinkedList<>();
        
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.print();
        list.remove(2);
        list.print();
        
        System.out.println(list.getElementAt(0));
        System.out.println(list.getElementAt(1));
        System.out.println(list.getElementAt(2));
    }
}
