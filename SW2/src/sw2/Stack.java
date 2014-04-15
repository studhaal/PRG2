/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sw2;

import java.util.ArrayList;

/**
 *
 * @author studhaal
 * @param <T>
 */
public class Stack<T> {

    private ArrayList<T> stack = new ArrayList();

    public void push(T d) {
        stack.add(d);
    }

    public Object pop() {
        return stack.remove(stack.size() - 1);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public boolean isFull() {
        return false;
    }
}
