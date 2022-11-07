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
public class KondisiDua {
    public static void main(String[]args) {
        Scanner masuk = new Scanner(System.in);
        
        System.out.println("Mengidentifikasi Bilangan Nol atau bukan");
        System.out.println("========================================");
        
        int pilih;
        String hasil;
        
        System.out.println("Masukan angka = ");
        pilih = masuk.nextInt();
        
        
        if(pilih == 0) {
            hasil = "Bilangan adalah Nol";
        } else {
            hasil = "Bilangan bukan Nol";
        }
        
        System.out.println("========================================");
        System.out.println(hasil);
        System.out.println("========================================");
    }
}
