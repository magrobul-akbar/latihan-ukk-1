/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul6;

/**
 *
 * @author PC SISWA
 */
public class String3 {

    public static void main(String[] args) {
        StringBuffer sbuf = new StringBuffer("smk bisa");
        sbuf.insert(4, "Sangat ");
        sbuf.insert(15, " gan!! ");
        System.out.println("Hasil : ");
        System.out.println(sbuf.toString().toUpperCase());
    }
}
