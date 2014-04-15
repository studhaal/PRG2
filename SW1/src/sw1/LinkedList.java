/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sw1;

/**
 *
 * @author studhaal
 * @param <T>
 */
public class LinkedList<T> {

    private ListNode<T> head;

    public LinkedList() {
        head = null;
    }

    public boolean isEmpty() {
        return (head == null);
    }

    public void insert(T d) {
        head = new ListNode<>(head, d);
    }

    public boolean isFound(T d) {
        ListNode<T> actualNode = head;
        while ((actualNode != null) && !d.equals(actualNode.getData())) {
            actualNode = actualNode.getNext();
        }
        return actualNode != null;
    }

    public void print() {
        ListNode<T> actualNode = head;
        System.out.println("-------");
        while (actualNode != null) {
            System.out.println(actualNode.getData());
            actualNode = actualNode.getNext();
        }
    }

    public int length() {
        ListNode<T> actualNode = head;
        int count = 0;
        while (actualNode != null) {
            count++;
            actualNode = actualNode.getNext();
        }
        return count;
    }
}
