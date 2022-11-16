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
public class DataDiri {

    public static void main(String[] args) {
        String nama, kelas, jurusan, alamat, tempatLahir, tanggalLahir;
        int absen, umur;
        Scanner scan = new Scanner(System.in);

        System.out.println("Masukan Data Diri");
        System.out.print("Masukan Nama : ");
        nama = scan.next();

        System.out.print("Masukan Kelas : ");
        kelas = scan.next();

        System.out.print("Masukan Jurusan : ");
        jurusan = scan.next();

        System.out.print("Masukan Nomor Absen : ");
        absen = scan.nextInt();

        System.out.print("Masukan Alamat : ");
        alamat = scan.next();

        System.out.print("Masukan Umur : ");
        umur = scan.nextInt();

        System.out.print("Masukan Alamat Tempat Lahir : ");
        tempatLahir = scan.next();

        System.out.print("Masukan Tanggal Lahir dalam format Y-m-d : ");
        tanggalLahir = scan.next();

        System.out.println("==============================================================");
        System.out.println("Nama : " + nama);
        System.out.println("Kelas : " + kelas);
        System.out.println("Jurusan : " + jurusan);
        System.out.println("Absen : " + absen);
        System.out.println("Alamat : " + alamat);
        System.out.println("Umur : " + umur);
        System.out.println("Tempat Tanggal Lahir : " + tempatLahir + ", " + tanggalLahir);
        System.out.println("==============================================================");
    }
}
