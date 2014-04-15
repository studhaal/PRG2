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
public class SW7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cube c1 = new Cube(1,1,2,3);
        Cube c2 = new Cube(2,10,20,30);
        Cube c3 = new Cube(3,3,2,1);
        Cube c4 = new Cube(4,2,56,7);
        System.out.print(c1.toString()+c2.toString()+c3.toString()+c4.toString());
    }
    
}
