/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan1;

/**
 *
 * @author lenovo
 */

import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        
//      instance of class
        Manusia[] m = new Manusia[2];
        
//      deklarasi variable
        int x = 0;
        
        do {
//            input
            System.out.println("User " + (x + 1));
            System.out.print("Masukkan tinggi badan Anda (cm) = ");
            double t = Double.parseDouble(br.readLine());
            System.out.print("Masukkan jenis kelamin Anda (L/P) = ");
            String jk = br.readLine();
            
//            proses + output
            if (jk.toUpperCase().equals("L")) {
                m[x] = new Laki_Laki(t);
                System.out.println("Berat badan ideal Anda adalah " + m[x].HtgBBI());
                System.out.println();
            } else {
                m[x] = new Perempuan(t);
                System.out.println("Berat badan ideal Anda adalah " + m[x].HtgBBI());
                System.out.println();
            }
            x++;
        } while (x < 2);
    }
}
