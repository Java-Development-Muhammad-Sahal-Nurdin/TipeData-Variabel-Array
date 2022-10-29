
// Problem : Tulisah program yang menggunakan variabel double untuk menghitung luas sebuah lingkaran.
/// Menghitung Luas lingkaran
import java.util.Scanner;

class HitungLuasLingkaran {
    public static void main(String[] args) throws Exception {
        // Deklarasi variabel
        double pi, r, luasLingkaran;

        pi = 3.14;

        // Menggunakan input user
        Scanner systemInput = new Scanner(System.in);

        System.out.println("Masukkan panjang dari jari-jari: ");
        r = systemInput.nextDouble();
        luasLingkaran = pi * r * r;

        System.out.println("Maka luas lingkaran adalah: " + luasLingkaran);
        systemInput.close(); // Menutup Scanner
    }
}
