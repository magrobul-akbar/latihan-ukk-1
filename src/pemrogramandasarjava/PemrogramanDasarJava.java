/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pemrogramandasarjava;

/**
 *
 * @author PC SISWA
 */
public class PemrogramanDasarJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i = 0;
        while (i < 5) {
            System.out.println(i + " While Loop");
            i++;
        }

        do {
            System.out.println(i + " Do While Loop");
            i++;
        } while (i < 10);
        
        for(int number = 1; number <= 10; number++) {
            System.out.println(number + " For Loop");
        }
    }

}
