/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sw3;
import java.util.ArrayList;
import java.util.ListIterator;
/**
 *
 * @author studhaal
 */
public class ListOne implements IList {
    private final ArrayList<Integer> list = new ArrayList();

    @Override
    public void add(Integer obj) {
        list.add(obj);
    }

    @Override
    public boolean remove(Integer obj) {
        return list.remove(obj);
    }

    @Override
    public boolean removeValue(int value) {
        return list.remove(value)!=null;
    }

    @Override
    public boolean removeValues(int value) {
        int count=0;
        while(list.remove(value)!=null){count++;}
        return count!=0;
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean exists(int value) {
        ListIterator<Integer> iterator;
        iterator = list.listIterator();
        boolean found = false;
        while(iterator.hasNext()==true)
        {
            if(iterator.next().intValue()==value){
                found = true;
            }
        }
        return found;
    }

    @Override
    public void print() {
        
    }
    
}
