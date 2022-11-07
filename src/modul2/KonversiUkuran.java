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
public class KonversiUkuran {
    public static void main(String[]args){
        Scanner gass = new Scanner(System.in);
        double km,m;
        
        System.out.print("masukan bilangan dalam satuan KM = ");
        km = gass.nextDouble();
        
        m = km *1000;
        System.out.println("hasil dalam meter = "+m);
    }
}
