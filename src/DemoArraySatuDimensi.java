// Problem : Tulislah sebuah program yang menggunakan sebuah array satu-dimensi 
public class DemoArraySatuDimensi {
    public static void main(String[] args) {
        double arrayAngka[] = { 10.1, 11.2, 12.3, 13.4, 14.5 };
        double hasil = 0;
        int i;

        for (i = 0; i < 5; i++)
            hasil = hasil + arrayAngka[i];
        System.out.println("Rerata adalah " + hasil / 5);

    }
}
