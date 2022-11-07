/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul3;
import java.util.Scanner;

/**
 *
 * @author PC SISWA
 */
public class KondisiSwitch2 {
    public static void main(String[]args) {
        Scanner go = new Scanner(System.in);
        
        System.out.println("=============================");
        System.out.println("Mengidentifikasi Bilangan Nol");
        System.out.println("=============================");
        
        int pilih;
        String hasil;
        
        System.out.println("Masukan  Bilangan = ");
        pilih = go.nextInt();
        
        switch (pilih) {
            case 0 : hasil = "Bilangan adalah Nol";
            break;
            default: hasil = "Bilangan bukan 0";
            break;
        }
        
        System.out.println("=============================");
        System.out.println(hasil);
        System.out.println("=============================");
    }
} 
