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
public class PerulanganWhile {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("==========================");
        System.out.println("Menampilkan bilangan 1 - 5");
        System.out.println("==========================");
        
        while(i <= 5) {
            System.out.println("Ini bilangan ke : " + i);
            i++;
        }
        
        int a = 5;
        System.out.println("==========================");
        System.out.println("Menampilkan bilangan 5 - 1");
        System.out.println("==========================");
        
        while(a >= 1) {
            System.out.println("Ini bilangan ke : " + a);
            a--;
        }
    }
}
