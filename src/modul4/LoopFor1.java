/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul4;

/**
 *
 * @author PC SISWA
 */
public class LoopFor1 {
    public static void main(String[] args) {
        int bil;
        
        System.out.println("=================================");
        System.out.println("Menampilkan bilangan genap 1 - 10");
        System.out.println("=================================");
        
        for(bil = 2; bil <= 10; bil+=2) {
            System.out.println("Ini adalah bilangan ke : " + bil);
        }
        
    }
}
