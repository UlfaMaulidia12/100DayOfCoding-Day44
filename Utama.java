package ProgramDay;

import java.util.Scanner;

public class Utama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai x: ");
        int x = scanner.nextInt();

        switch (x) {
            case 1:
                System.out.println("nilai x = 1");
                break;
            case 2:
                System.out.println("nilai x = 2");
                break;
            case 3:
                System.out.println("nilai x = 3");
                break;
            default:
                System.out.println("nilai x tidak diketahui");
        }

        // Memeriksa apakah nilai yang dimasukkan adalah genap atau ganjil
        if (x % 2 == 0) {
            System.out.println("nilai x adalah bilangan genap");
        } else {
            System.out.println("nilai x adalah bilangan ganjil");
        }

        // Menghitung dan menampilkan faktorial dari nilai x
        int faktorial = hitungFaktorial(x);
        System.out.println("Faktorial dari " + x + " adalah: " + faktorial);
    }

    private static int hitungFaktorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * hitungFaktorial(n - 1);
        }
    }
}
