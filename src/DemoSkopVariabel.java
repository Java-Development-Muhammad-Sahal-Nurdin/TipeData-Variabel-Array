// Problem : Tulislah sebuah program untuk mendemonstrasikan skop-skop variabel.
public class DemoSkopVariabel {
    public static void main(String[] args) {
        int x; // Dikenali oleh semua mthod di dalam main
        x = 10;

        if (x == 10) {// Mulai skop
            int y = 20; // Hanya dikenali di dalam block if ini

            // x dan y keduanya dikenali di sini
            System.out.println("x dan y: " + x + " " + y);
            x = y * 2;
        }
        // y = 100 / // Error! y tidak dikenali di sini
        // x masih dikenali di sini.
        System.out.println("x adalah " + x);

    }
}
