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
public class KondisiBanyak {
    public static void main(String[]args) {
        Scanner gas = new Scanner(System.in);
        
        System.out.println("Pilihan Jurusan SMK 1 Selong");
        System.out.println("=====================================");
        System.out.println("1. Rekayasa Perangakat Lunak / TI");
        System.out.println("2. Teknik Komputer & Jaringan / TI");
        System.out.println("3. Multimedia / TI");
        System.out.println("4. Desain Grafis / Campuran");
        
        int pilih;
        System.out.println("Pilih Jurusan Yang anda Inginkan= ");
        pilih = gas.nextInt();
        
        String jurusan;
        
        if(pilih == 1) {
            jurusan = "1. Rekayasa Perangkat Lunak / TI";
        } else if (pilih == 2) {
            jurusan = "2. Teknik Komputer & Jaringan / TI";
        } else if (pilih == 3) {
            jurusan = "3. Multimedia / TI";
        } else if(pilih == 4) {
            jurusan = "4. Desain Grafis / Campuran";
        } else {
            jurusan = "Jurusan yang anda pilih tidak tersedia";
        }
        
        System.out.println("===============================");
        System.out.println(jurusan);
        System.out.println("===============================");
    }
}
