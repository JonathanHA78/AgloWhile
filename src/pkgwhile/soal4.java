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

public class soal4 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int deret, i = 0, sum = 0;
        System.out.println("Masukkan deret");
        deret = s.nextInt();
        do {
            i++;
            if (i % 2 != 0) { // ngebuat yg di print jadi bilangan ganjil
                System.out.print(i + " ");
                sum += i;//ngejumlahin terus si i yang di print
            }
        } while (i < deret);
        System.out.println("");

        System.out.println("hasil bilangan ganjil pada deret adalah = " + sum);

    }
}
