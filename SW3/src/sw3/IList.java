/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sw3;

/**
 *
 * @author studhaal
 */
public interface IList {
    
    /**
     * 
     * @param obj Integer-Objekt das der Liste übergeben wird.
     */
    void add(Integer obj);
    
    /**
     * 
     * @param obj Integer-Objekt das aus der Liste entfernt werden soll
     * @return boolean Wert ob das Objekt gelöscht werden konnte
     */
    boolean remove(Integer obj);
    
    /**
     * 
     * @param value Integer Wert der aus der Liste entfernt werden soll.
     * @return boolean Wert ob das Objekt gelöscht werden konnte
     */
    boolean removeValue(int value);
    /**
     * 
     * @param value
     * @return boolean Wert ob das Objekt gelöscht werden konnte
     */
    boolean removeValues(int value);
    
    /**
     * 
     * @return Integer Wert der die Anzahl Objekte in der Liste angibt.
     */
    int size();
    
    /**
     * 
     * @param value Integer Wert der den Wert eines Integer-Objekts repräsentiert
     * @return boolean Wert ob ein Integer-Objekt mit dem Wert von value übereinstimmt.
     */
    boolean exists(int value);
    
    /**
     * Diese Methode gibt alle Werte der Integer-Objekte in der Liste aus.
     */
    void print();
}
