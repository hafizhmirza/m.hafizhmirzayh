import java.util.Scanner;

public class Soal_5_hafizhmirza_09011282328077_UASPEMKOM {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Pilih operasi:");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");

            int pilihan = scanner.nextInt();

            // Menerima input bilangan pertama
            System.out.print("Masukkan bilangan pertama: ");
            int bilangan1 = scanner.nextInt();

            // Menerima input bilangan kedua
            System.out.print("Masukkan bilangan kedua: ");
            int bilangan2 = scanner.nextInt();

            // Melakukan operasi sesuai pilihan
            switch (pilihan) {
                case 1:
                    System.out.println("Hasil penjumlahan: " + penjumlahan(bilangan1, bilangan2));
                    break;
                case 2:
                    System.out.println("Hasil pengurangan: " + pengurangan(bilangan1, bilangan2));
                    break;
                case 3:
                    System.out.println("Hasil perkalian: " + perkalian(bilangan1, bilangan2));
                    break;
                case 4:
                    System.out.println("Hasil pembagian: " + pembagian(bilangan1, bilangan2));
                    break;
                default:
                    System.out.println("Pilihan operasi tidak valid!");
            }
        }
    }

    public static int penjumlahan(int bilangan1, int bilangan2) {
        return bilangan1 + bilangan2;
    }

    public static int pengurangan(int bilangan1, int bilangan2) {
        return bilangan1 - bilangan2;
    }

    public static int perkalian(int bilangan1, int bilangan2) {
        return bilangan1 * bilangan2;
    }

    public static double pembagian(int bilangan1, int bilangan2) {
        return (double) bilangan1 / bilangan2;
    }
}