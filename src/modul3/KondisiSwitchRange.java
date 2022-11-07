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
public class KondisiSwitchRange {
    public static void main(String[]args) {
        Scanner range = new Scanner(System.in);
        
        // range nilai
        System.out.println("100 s/d 90 Nilai Huruf = A, Lulus");
        System.out.println("89 s/d 85 Nilai Huruf = B, Lulus");
        System.out.println("84 s/d 75 Nilai Huruf = C, Lulus Cukup");
        System.out.println("74 s/d 60 Nilai Huruf = D, Tidak Lulus");
        System.out.println("59 s/d 0 Nilai Huruf = E, Tidak Lulus");
        
        int nilai;
        int hasil;
        
        System.out.println("Masukan Angka Switch :");
        nilai = range.nextInt();
        if(nilai <= 100 && nilai >= 90) {
            hasil = 1;
        } else if (nilai <= 89 && nilai >= 85) {
            hasil = 2;
        } else if(nilai <= 84 && nilai >= 75) {
            hasil = 3;
        } else if(nilai <= 74 && nilai >= 60) {
            hasil = 4;
        } else if(nilai <= 59 && nilai >= 0) {
            hasil = 5;
        } else {
            hasil = 0;
        }
        
        switch (hasil) {
            case 0:
                System.out.println("Error : Kesalahan tidak diketahui");
            break;
            case 1:
                System.out.println("A, Lulus");
            break;
            case 2:
                System.out.println("B, Lulus");
            break;
            case 3:
                System.out.println("C, Lulus Cukup");
            break;
            case 4:
                System.out.println("D, Tidak Lulus");
            break;
            case 5:
                System.out.println("E, Tidak Lulus");
            break;
        }
    }
    
}
