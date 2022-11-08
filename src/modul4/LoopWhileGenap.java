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
public class LoopWhileGenap {
    public static void main(String[] args) {
        int i = 2;
        System.out.println("======================================");
        System.out.println("Menampilkan bilangan Genap dari 2 - 10");
        System.out.println("======================================");
        
        while(i <= 10) {
            System.out.println("Ini bilangan ke : " + i);
            i+=2;
        }
    }
}
