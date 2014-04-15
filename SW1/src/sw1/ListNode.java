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
public class ListNode<T> {

    private T data;
    private ListNode<T> next;

    public ListNode(ListNode<T> n, T d) {
        next = n;
        data = d;
    }

    public void setData(T d) {
        data = d;
    }

    public T getData() {
        return data;
    }

    public void setNext(ListNode<T> n) {
        next = n;
    }

    public ListNode<T> getNext() {
        return next;
    }

}
