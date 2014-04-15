/* Copyright 2014 Hochschule Luzern - Technik & Architektur */
package ch.hslu.ta.prg2.sw1;

/**
 * Represents a node in a linked list.
 *
 * @param <T> Data type to store in the list
 * @author Peter Sollberger <peter.sollberger@hslu.ch>
 */
public class ListNode<T>
{
    private T data;
    private ListNode<T> next;

    public ListNode(ListNode<T> n, T d)
    {
        next = n;
        data = d;
    }

    public void setData(T d)
    {
        data = d;
    }

    public T getData()
    {
        return data;
    }

    public void setNext(ListNode<T> n)
    {
        next = n;
    }

    public ListNode<T> getNext()
    {
        return next;
    }
}
