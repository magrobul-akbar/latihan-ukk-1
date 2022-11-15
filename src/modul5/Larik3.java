/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul5;

/**
 *
 * @author PC SISWA
 */
public class Larik3 {
    public static void main(String []args) {
        int bulan[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        for(int i = 0; i < bulan.length; i++) {
            System.out.println("Bulan ke " + (i + 1) + " = " + bulan[i]);
        }
    }
}
