/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul2;
import java.util.Scanner;

/**
 *
 * @author PC SISWA
 */
public class Jumlah {
    public static void main(String[]args){
        Scanner masuk = new Scanner(System.in);
        
        double a,b, jumlah,jumlah2,jumlah3,jumlah4,jumlah5;
        
        System.out.println("Masukan angka pertama");
        a = masuk.nextDouble();
        System.out.println("Masukan angka kedua");
        b = masuk.nextDouble();
        
        jumlah = a+b;
        jumlah2 = a*b;
        jumlah3 =a/b;
        jumlah4 =a-b;
        jumlah5 =a%b;
        
        System.out.println("Hasil penjumlahan :"+jumlah);
        System.out.println("hasil perkalian :"+jumlah2);
        System.out.println("hasil pembagian :"+jumlah3);
        System.out.println("hasil pengurangan"+jumlah4);
        System.out.println("hasil modulus"+jumlah5);
        
    }
}
