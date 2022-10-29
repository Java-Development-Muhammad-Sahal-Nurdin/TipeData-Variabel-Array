import java.util.Scanner;

public class HitungJarakJelajahCahaya {
    public static void main(String[] args) throws Exception {
        // Deklarasi Variabel
        long jumlahHari, panjangKM, kecepatanCahaya, detik;

        // Input user
        Scanner systemInput = new Scanner(System.in);
        System.out.println("Masukkan kecepatan cahaya yang dinginkan: ");
        kecepatanCahaya = systemInput.nextLong();
        System.out.println("Masukkan jumlah hari yang dinginkan: ");
        jumlahHari = systemInput.nextLong();

        // Menghitung jarak jelajah cahaya dalam detik
        detik = jumlahHari * 60 * 60 * 24;
        panjangKM = kecepatanCahaya * detik;

        System.out.println("Dalam " + jumlahHari + " hari, cahaya menjelajah berkisar " + panjangKM + " km.");
        systemInput.close();
    }
}
