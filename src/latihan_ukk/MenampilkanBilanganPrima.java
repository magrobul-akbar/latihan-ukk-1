/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan_ukk;

import java.util.Scanner;

/**
 *
 * @author PC SISWA
 */
public class MenampilkanBilanganPrima {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int bil, nilaiAwal, nilaiAkhir;

        System.out.print("Menampilkan Bilangan Prima dari Range : ");
        nilaiAwal = scan.nextInt();
        System.out.print("Sampai : ");
        nilaiAkhir = scan.nextInt();
        System.out.println("=======================================");
        
        // lakukan pengulangan dari nilaiAwal sampai nilaiAkhir
        for (int i = nilaiAwal; i <= nilaiAkhir; i++) {
            // set nilai default bil = 0
            bil = 0;
            
            // lakukan pengulangan sebanyak i
            for (int j = 1; j <= i; j++) {
                
                // jika hasil dari i dibagi j == 0
                if (i % j == 0) {
                    
                    // set nilai bil ditambahkan dengan 1
                    bil = bil + 1;
                }
            }
            
            // jika nilai dari bil == 2 maka cetak
            if (bil == 2) {
                System.out.print(i + " ");
            }
        }
        
        System.out.println("");
        System.out.println("=======================================");

    }
}
