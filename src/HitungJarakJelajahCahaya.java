import java.util.Scanner;

import javafx.scene.paint.Stop;

public class HitungJarakJelajahCahaya {
    public static void main(String[] args) throws Exception {
        // Deklarasi Variabel
        long jumlahHari, panjangKM, kecepatanCahaya, detik;

        // Input user
        Scanner systemInput = new Scanner(System.in);
        System.out.println("Masukkan kecepatan cahaya yang dinginkan ");

        // Menghitung jarak jelajah cahaya dalam detik
        kecepatanCahaya = systemInput.nextLong();
        jumlahHari = systemInput.nextLong();
        detik = jumlahHari * 60 * 60 * 24;
        panjangKM = kecepatanCahaya * detik;

        System.out.println("Dalam " + jumlahHari + " hari, cahaya menjelajah berkisar " + panjangKM + " km.");
        systemInput.close();
    }
}
