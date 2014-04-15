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
public class Konto {

    private static int count = 0;
    private int no;
    private double saldo;
    private double rate;

    public Konto() {
        no = count;
        count++;
        saldo = 0.0;
        rate = 0.0;
    }

    public Konto(double s, double r) {
        no = count;
        count++;
        saldo = s;
        rate = r;
    }

    public int getKontonummer() {
        return no;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getRate() {
        return rate;
    }

    public void payIn(double i) {
        if (i > 0.0) {
            saldo = saldo + i;
        }
    }

    public void payOut(double o) {
        if (o > 0.0 && o <= saldo) {
            saldo = saldo - o;
        }
    }

    public void print() {
        System.out.println("Kontonummer: " + no);
        System.out.println("Saldo: " + saldo);
        System.out.println("Zinssatz: " + rate);
    }
    
    @Override
    public String toString(){return "Kontonummer: "+no+String.format("%n")+"Saldo: "+saldo+String.format("%n")+"Zinssatz: "+rate;}
}
