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
public class LoopWhileGanjil {
    public static void main(String[] args) {
        int i = 9;
        System.out.println("======================================");
        System.out.println("Menampilkan bilangan Ganjil dari 9 - 1");
        System.out.println("======================================");
        
        while(i >= 1) {
            System.out.println("Ini bilangan ke : " + i);
            i-=2;
        }
    }
}
