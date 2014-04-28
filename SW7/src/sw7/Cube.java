/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sw7;


/**
 *
 * @author studhaal
 */
public class Cube implements Comparable<Cube> {

    private int number;
    private int s1, s2, s3;

    public Cube(int no, int a, int b, int c) {
        number = no;
        s1 = a;
        s2 = b;
        s3 = c;
    }

    public int getVolume() {
        return s1 * s2 * s3;
    }

    public int getSurface() {
        return s1 * s2 + s2 * s3 + s1 * s3;
    }

    public int getMaxDimension() {
        return Math.max(Math.max(s1, s2), s3);
    }

    @Override
    public String toString() {
        return "--------------------"
                + System.lineSeparator()
                + "CUBE "
                + number
                + System.lineSeparator()
                + "Sides: " + s1 + " " + s2 + " " + s3
                + System.lineSeparator()
                + "Volume: " + getVolume()
                + System.lineSeparator()
                + "Surface: " + getSurface()
                + System.lineSeparator();
    }
    
    @Override
    public boolean equals(Object obj)
    {
        if(this==obj)
        {
            return true;
        }
        if(obj==null)
            return false;
        if(obj instanceof Cube)
        {
            Cube cube = (Cube)obj;
            return cube.getVolume()==this.getVolume();
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 59 * hash + this.number;
        hash = 59 * hash + this.s1;
        hash = 59 * hash + this.s2;
        hash = 59 * hash + this.s3;
        return hash;
    }
    
    @Override
    public int compareTo(Cube c)
    {
        if(this.equals(c))
            return 0;
        if(c==null)
            return -1;
        return this.getVolume()-c.getVolume();
    }
}
