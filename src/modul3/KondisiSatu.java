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
public class KondisiSatu {
    public static void main(String args[]) {
        Scanner masuk = new Scanner(System.in);
        
        System.out.println("Mengidendifikasi Bilangan Nol");
        System.out.println("=============================");
        int pilih;
        
        System.out.println("Masukan Angka= ");
        pilih = masuk.nextInt();
        
        if(pilih == 0) {
            System.out.println("Bilangan Nol");
        }
        
    }
}
