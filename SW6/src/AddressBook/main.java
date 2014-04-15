/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package AddressBook;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author studhaal
 */
public class main {
    public static void main(String args[])
    {
        AddressBook ab = new AddressBook();
        try {
            ab.tester();
        } 
        catch(NumberFormatException ex){
            System.out.println("NumberFormatException: " + ex.getMessage());
        }
        catch (IllegalArgumentException ex) {
            System.out.println("IllegalArgumentException: "+ex.getMessage());
        }
        catch(InvalidEmailException ex){
            System.out.println("InvalidEmailException: "+ex.getMessage());
        }
        catch(Exception ex){
            System.out.println("Exception: " + ex.getMessage());
        }
    }
}
