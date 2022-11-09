/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul4;
import java.util.Scanner;

/**
 *
 * @author PC SISWA
 */
public class MenghitungJumlahDataMataPelajaran {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        int nilai, banyakMapel, data;
        double jumlah, rata2;
        String nilaiAkhir;
        
        System.out.print("Banyak Mata Pelajaran yang di Ikuti : ");
        banyakMapel = scan.nextInt();
        jumlah = 0;
        
        for(data = 1; data <= banyakMapel; data++) {
            System.out.print("Mata Pelajaran ke " + data + " = ");
            nilai = scan.nextInt();
            jumlah += nilai;
        }
        
        rata2 = jumlah / banyakMapel;
        System.out.println("Jumlah : " + jumlah);
        System.out.println("Nilai Rata - Rata : " + rata2);
        
        if(Math.round(rata2) <= 100 && Math.round(rata2) >= 90) {
            nilaiAkhir = "Nilai Akhir = A, Ye Anda Lulus";
        } else if(Math.round(rata2) <= 89 && Math.round(rata2) >= 85) {
             nilaiAkhir = "Nilai Akhir = B, Anda Lulus";
        } else if(Math.round(rata2) <= 84 && Math.round(rata2) >= 75) {
            nilaiAkhir = "Nilai Akhir = C, Cukup Lulus";
        } else if(Math.round(rata2) <= 74 && Math.round(rata2) >= 60) {
            nilaiAkhir = "Nilai Akhir = D, Tidak Lulus";
        } else if(Math.round(rata2) <= 59 && Math.round(rata2) >= 0) {
            nilaiAkhir = "Nilai Akhir = E, Tidak Lulus";
        } else {
            nilaiAkhir = "Anda Gagal!!!";
        }
        
        System.out.println(nilaiAkhir);
    }
}
