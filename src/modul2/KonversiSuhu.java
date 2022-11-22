/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul2;

import java.util.Scanner;

/**
 *
 * @author PC SISWA
 */
public class KonversiSuhu {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Tugas Konversi Suhu Celcius --Java");
        System.out.println("========================");
        System.out.println();
        
        double celc, fahr, kelv, ream;
        
        System.out.print("Masukan suhu : ");
        celc = input.nextDouble();
        
        fahr = (9.0/5.0 * celc) + 32;
        kelv = celc + 273.15;
        ream = celc * (4.0/5.0) ;

        System.out.println(celc+" derajat Celcius = "+fahr+" derajat Fahrenheit");
        System.out.println(celc+" derajat Celcius = "+kelv+" derajat Kelvin");
        System.out.println(celc+" derajat Celcius = "+ream+" derajat Reamur");
    }
}
