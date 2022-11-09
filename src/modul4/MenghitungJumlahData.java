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
public class MenghitungJumlahData {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // variabel
        int banyakData, data, nilai;
        double jumlah, rata2;
        
        System.out.println("Menghitung jumlah dan rata - rata nilai");
        System.out.print("Banyak data : ");
        banyakData = scan.nextInt();
        
        jumlah = 0;
        
        
        for(data = 1; data <= banyakData; data++) {
            System.out.print("Data ke : " + data + " = ");
            nilai = scan.nextInt();
            jumlah += nilai;
        }
        
        rata2 = jumlah / banyakData;
        
        System.out.println("Jumlah = " + jumlah);
        System.out.println("Nilai Rata rata = " + rata2);
        
    }
}
