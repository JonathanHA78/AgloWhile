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
//import java.util.LinkedList;
import java.util.Scanner;
//import java.lang.Object;
public class soal2 {

    public static void main(String[] args) {
//        LinkedList<String> a = new LinkedList<String>();
//        a.add("1");
//        a.add("2");
//        for (String xxx : a) {
//            System.out.println(xxx);
//        }
        Scanner s = new Scanner(System.in);
        int num, pilihan;
        String hasil;
        do {
            System.out.println("Pilihan");
            System.out.println("1. Konversi ke bilangan biner");
            System.out.println("2. Konversi ke bilangan oktal");
            System.out.println("3. Keluar program");
            System.out.println("Masukkan nomor pilihan = ");
            pilihan = s.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Konversi ke bilangan biner");
                    System.out.println("Masukkan angka = ");
                    num = s.nextInt();
                    hasil = Integer.toBinaryString(num);
                    System.out.println("Hasil konversi ke bilangan biner = " + hasil);
                    break;
                case 2:
                    System.out.println("Konversi ke bilangan oktal");
                    System.out.println("Masukkan angka = ");
                    num = s.nextInt();
                    hasil = Integer.toOctalString(num);
                    System.out.println("Hasil konversi ke bilangan oktal = " + hasil);
                    break;
                case 3:
                    System.out.println("Keluar program");
                    break;
                default:
                    System.out.println("Nomor yang anda masukkan salah, silahkan masukkan ulang ;) ");
            }
        } while (pilihan != 3);
        System.out.println("Selesai azekk..");

    }
}
