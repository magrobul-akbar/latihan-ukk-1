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
public class KonversiUkuran2 {
    public static void main(String[]args){
        Scanner masuk = new Scanner(System.in);
        
        double m,cm,inci,km;
        
        System.out.println("masukan bilangan dalam satuan m =");
        m = masuk.nextDouble();
        cm = m * 100;
        inci = m* 39.370;
        km = m* 1000;
        
        System.out.println("hasil dalam cm ="+cm);
        System.out.println("hasil dalam inci ="+inci);
        System.out.println("hasail dalam km ="+km);
    }
}
