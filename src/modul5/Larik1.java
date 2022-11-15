/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul5;
import java.util.Scanner;

/**
 *
 * @author PC SISWA
 */
public class Larik1 {
    public static void main(String []args) {
        Scanner masuk = new Scanner(System.in);
        float nilai[] = new float[5];
        System.out.println("Masukan 5 data nilai : ");
        for(int i = 0; i < nilai.length; i++) {
            System.out.println("Data ke " + (i + 1)  + " : ");
            nilai[i] = masuk.nextInt();
        }
        
        System.out.println("Data Nilai yang dimasukan: ");
        for(int i = 0; i < nilai.length; i++) {
            System.out.println(nilai[i]);
        }
    }
}
