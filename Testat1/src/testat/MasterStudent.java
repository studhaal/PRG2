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
public class MasterStudent extends Student {

    private String advisor;
    
    public MasterStudent(String name, int ects, String advisor) {
        super(name, ects);
        this.advisor = advisor;
    }
    
    public String toString()
    {
        return super.toString() + " " + advisor;
    }
}
