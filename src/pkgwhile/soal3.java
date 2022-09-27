/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgwhile;

/**
 *
 * @author JoeMaxwell
 */
import java.util.Scanner;

public class soal3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int angka, hasil = 0, reversed;
        System.out.println("Masukkan angka = ");
        angka = s.nextInt();

        do {
            reversed = angka % 10;
            hasil = hasil * 10 + reversed;
            angka = angka / 10;

        } while (angka > 0);
        System.out.println("Reversed = " + hasil);

    }
}
//Masukkan angka = 
//123
//hasil reversed = 3
//output hasil = 3
//output angka = 12
//hasil reversed = 2
//output hasil = 32
//output angka = 1
//hasil reversed = 1
//output hasil = 321
//output angka = 0
//Reversed = 321
