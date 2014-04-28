/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sw7;

import java.util.Comparator;

/**
 *
 * @author studhaal
 */
public class SurfaceComparator implements Comparator<Cube> {

    @Override
    public int compare(Cube c1, Cube c2) {
        return c1.getSurface()-c2.getSurface();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (this == null) {
            return false;
        }
        return this.getClass() == obj.getClass();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }
}
