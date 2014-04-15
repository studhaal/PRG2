package MountainSort;

import java.util.Comparator;

public class HeightCompare implements Comparator <Mountain> {
    @Override
    public int compare(Mountain b1, Mountain b2) {
        return (b1.getHeight() - b2.getHeight());
        // hier steht Ihre Implementation
    }
    @Override
    public boolean equals(Object obj)
    {
        if(this==obj)
            return true;
        if(obj==null){
            return false;
        }
        return(this.getClass() == obj.getClass());
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }
}