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
public class DoKonversi {
    public static void main(String[] args) {

        System.out.println("Tugas Konversi Suhu Celcius dari 1 - 10");
        System.out.println("=======================================");
        System.out.println();

        double fahr;

        int celc = 1;

        do {
            fahr = (9.0 / 5.0 * celc) + 32;
            System.out.println(celc + " derajat Celcius = " + fahr + " derajat Fahrenheit");
            celc++;
        } while (celc <= 10);

    }
}
