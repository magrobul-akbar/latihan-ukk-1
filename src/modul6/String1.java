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
public class String1 {
    public static void main(String[]args) {
        byte data[] = new byte[6];
        data[0] = 64;
        data[1] = 65;
        data[2] = 66;
        data[3] = 67;
        data[4] = 68;
        data[5] = 69;
        String s1 = "Ohayou Gozaimase";
        String s2 = new String("Klemak Wet");
        String s3 = new String(data);
        String s4 = new String(data,0,3);
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);
        System.out.println("s4 = " + s4);
    }
}
