/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prak1;

/**
 *
 * @author ASUS
 */
public class Prak1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Deklarasi dan inisialisasi variabel
        int a = 3;
        //perulangan
        for (int i = 0; i <= a; i++) {
            for (int u = 0; u <= a; u++) {
                // percabangan
                if (i == 0 || u == 0 || i == a || u == a) {
                    System.out.print("@ ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

}
