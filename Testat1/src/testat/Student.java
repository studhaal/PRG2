/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package testat;

/**
 *
 * @author studhaal
 */
public class Student {
    private String name;
    private int ects;
    
    public Student(String name, int ects)
    {
        this.name = name;
        this.ects = ects;
    }
    
    public String toString()
    {
        return (name + " " + ects);
    }
    
    public void print()
    {
        System.out.println(this);
    }
}
