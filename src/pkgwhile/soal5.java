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

public class soal5 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int angka, arm=0 , angkax, same, pangkat = 0,ulang ;
        System.out.println("Masukkan angka");
        angka = s.nextInt();
        same = angka;
        do {
            pangkat = pangkat + 1;
            same = same / 10;
        } while (same != 0);
        same = angka;
        do {
            angkax = same % 10;
            ulang = 1;
            for (int i = 0; i < pangkat; i++) {
                ulang *= angkax ;
            }
            arm += ulang;
            same = same / 10;
            System.out.println(arm);
        } while (same > 0);

        if (angka == arm) {
            System.out.println(angka + " adalah bilangan Armstrong");
        } else {
            System.out.println(angka + " bukan bilangan Armstrong");
        }
    }
}
