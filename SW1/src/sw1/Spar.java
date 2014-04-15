/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sw1;

/**
 *
 * @author studhaal
 */
public class Spar extends Konto {

    private double maxOut;

    public Spar(double s, double r, double o) {
        super(s, r);
        maxOut = o;
    }

    @Override
    public double getSaldo() {
        return super.getSaldo();
    }

    @Override
    public void payOut(double o) {
        if (o <= maxOut) {
            super.payOut(o);
        }
    }

    @Override
    public void print() {
        super.print();
        System.out.println("max. Auszahlung: " + maxOut);
    }

    @Override
    public String toString() {
        return super.toString()+String.format("%n")+"max. Auszahlung: "+maxOut;
    }
}
