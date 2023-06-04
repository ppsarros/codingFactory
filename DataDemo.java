/*
* file DataDemo 0.1 03/08/2019
*
* copyright (c) P. Psarros
* 63 Taxirxon St., 18648 Athens, Greece.
* Eurobank SA
* All rights reserved
 */

package gr.aueb.elearn.ch1;

import java.net.SocketOption;

/**
 * Υπολογίζει το άθροισμα δύο
 * αριθμών, του 12 και του 5.
 *
 * @author P. Psarros
 */

public class DataDemo {

    public static void main(String[] args) {

        // Δήλωση και Αρχικοποίηση Μεταβλητών
        int num1 = 12;
        int num2 = 5;
        int sum;

        // Εντολές
        sum = num1 + num2;

        // Εμφάνιση των αποτελεσμάτων
        System.out.print("Το άθροισμα των 12 και 5 είναι " + sum + "\n");
        System.out.println("Το άθροισμα των " + num1 + " + " + num2 + " = " + sum);
        System.out.printf("Το άθροισμα των %d + %d = %d",num1,num2,sum);
    }
}
