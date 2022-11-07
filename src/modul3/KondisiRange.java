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
public class KondisiRange {
    public static void main(String[]args) {
        Scanner range = new Scanner(System.in);
        
        // range nilai
        System.out.println("100 s/d 90 Nilai Huruf = A, Lulus");
        System.out.println("89 s/d 85 Nilai Huruf = B, Lulus");
        System.out.println("84 s/d 75 Nilai Huruf = C, Lulus Cukup");
        System.out.println("74 s/d 60 Nilai Huruf = D, Tidak Lulus");
        System.out.println("59 s/d 0 Nilai Huruf = E, Tidak Lulus");
        
        int angka;
        String hasil;
        
        System.out.println("Masukan Angka :");
        angka = range.nextInt();
        
        if(angka <= 100 && angka >= 90) {
            hasil = "A, Lulus";
        } else if(angka <= 89 && angka >= 85) {
            hasil = "B, Lulus";
        } else if(angka <= 84 && angka >= 75) {
            hasil = "C, Lulus Cukup";
        } else if(angka <= 74 && angka >= 60) {
            hasil = "D, Tidak Lulus";
        } else if (angka <= 59 && angka >= 0) {
            hasil = "E, Tidak Lulus";
        } else {
            hasil = "Error : Nilai yang anda masukan lebih dari 100 atau kurang dari 0";
        }
        
        System.out.println("==============================");
        System.out.println(hasil);
        System.out.println("==============================");
        
    }
}
