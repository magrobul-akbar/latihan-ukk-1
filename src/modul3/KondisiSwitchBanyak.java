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
public class KondisiSwitchBanyak {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Pilihan Jurusan SMK 1 Selong");
        System.out.println("=====================================");
        System.out.println("1. Rekayasa Perangakat Lunak / TI");
        System.out.println("2. Teknik Komputer & Jaringan / TI");
        System.out.println("3. Multimedia / TI");
        System.out.println("4. Desain Grafis / Campuran");
        
        int opsi;
        System.out.print("Pilih Jurusan = ");
        opsi = input.nextInt();
        
        switch(opsi) {
            case 1 : System.out.println("1. Rekayasa Perangakat Lunak / TI");
            break;
            case 2 : System.out.println("2. Teknik Komputer & Jaringan / TI");
            break;
            case 3 : System.out.println("3. Multimedia / TI");
            break;
            case 4 : System.out.println("4. Desain Grafis / Campuran");
            break;
            default : System.out.println("Jurusan tidak ada");
            break;
        }
    }
}
