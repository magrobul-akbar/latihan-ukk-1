/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul5;

/**
 *
 * @author PC SISWA
 */
public class Larik2 {
    public static void main(String []args) {
        int kuadrat[];
        kuadrat = new int[10];
        for(int i = 0; i < kuadrat.length; i++) {
            kuadrat[i] = (i + 1) * (i + 1);
            System.out.println("Kuadrat " + (i + 1) + " = " + kuadrat[i]);
        }
    }
}
