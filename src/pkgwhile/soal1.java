
package pkgwhile;

/**
 *
 * @author JoeMaxwell
 */
import java.util.Scanner;

public class soal1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String hasil;
        int pin = 123456, pinmasukan;
        int percobaan = 0;

        do {
            System.out.println("Masukkan pin ATM : ");
            pinmasukan = s.nextInt();
            
            percobaan = percobaan + 1;
        } while (pinmasukan != pin || percobaan < 3);
        if (pinmasukan == pin) {
                hasil = "Berhasil";
            }
            else {
                hasil = "Gagal";
            }
        System.out.println(hasil);
    }
}
