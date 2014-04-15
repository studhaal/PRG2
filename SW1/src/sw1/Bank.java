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
public class Bank {

    public static void main(String[] args) {
        Bank b = new Bank("Raiffeisen");
        b.openKonto();
        b.openSpar(10000.0, 2.0, 1000.0);
        b.openKonto();
        b.openKonto();
        b.noOfAccounts();
        b.printAccounts();
    }

    private static String name;
    private final LinkedList<Konto> accountList;

    public Bank(String n) {
        name = n;
        accountList = new LinkedList();
    }

    public void openKonto() {
        Konto k = new Konto();
        k.print();
        accountList.insert(k);
    }

    public void openSpar(double s, double r, double o) {
        Konto k = new Spar(s, r, o);
        accountList.insert(k);
    }

    public void noOfAccounts() {
        System.out.println("Anzahl Accounts: " + accountList.length());
    }

    public void printAccounts() {
        accountList.print();
    }

    public void printFund() {

    }
}
