public class DemoTipeBoolean {
    public static void main(String[] args) {
        boolean b;
        b = false;
        System.out.println("b adalah " + b);

        b = true;
        System.out.println("b adalah " + b);

        if (b)
            System.out.println("perintah ini akan di eksekusi");

        b = false;
        if (b)
            System.out.println("perintah ini tidak akan dijalankan");

        System.out.println("10 > 9 adalah " + (10 > 9));

    }

}
