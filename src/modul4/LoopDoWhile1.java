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
public class LoopDoWhile1 {

    public static void main(String[] args) {
        System.out.println("===========================");
        System.out.println("Menampilkan bilangan 1 - 10");
        System.out.println("===========================");

        int i = 1;

        do {
            System.out.println("Ini bilangan ke : " + i);
            i++;
        } while (i <= 10);
    }
}
