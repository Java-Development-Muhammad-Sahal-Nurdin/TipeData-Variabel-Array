// Problem : Tulislah sebuah program yang mendemosntrasikan pelbagai konversi tipe 
public class DemoCast {
    public static void main(String[] args) {
        byte b;
        int i = 257;
        double d = 323.142;

        System.out.println("\nKonversi dari int menjadi byte.");
        b = (byte) i;
        System.out.println(" i dan b " + i + " " + b);

        System.out.println("\nKonversi dari double menjadi int.");
        i = (int) d;
        System.out.println(" i dan d " + i + " " + d);

        System.out.println("\nKonversi dari double menjadi byte.");
        b = (byte) d;
        System.out.println(" b dan d " + i + " " + b);

    }

}
