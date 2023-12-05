import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input jumlah barang yang dibeli oleh pelanggan
        System.out.print("Masukkan jumlah barang yang dibeli: ");
        int jumlahBarang = scanner.nextInt();

        // Input harga per barang
        System.out.print("Masukkan harga per barang: ");
        double hargaPerBarang = scanner.nextDouble();

        // Hitung total harga sebelum diskon
        double totalHarga = jumlahBarang * hargaPerBarang;

        // Hitung diskon berdasarkan jumlah pembelian
        double diskon = 0.0;
        if (jumlahBarang >= 5 && jumlahBarang <= 10) {
            diskon = 0.05;
        } else if (jumlahBarang >= 11 && jumlahBarang <= 20) {
            diskon = 0.1;
        } else if (jumlahBarang > 20) {
            diskon = 0.2;
        }

        // Hitung total harga setelah diskon
        double totalHargaSetelahDiskon = totalHarga - (totalHarga * diskon);

        // Tampilkan total harga setelah diskon
        System.out.println("Total harga setelah diskon: " + totalHargaSetelahDiskon);

        // Tutup scanner
        scanner.close();
    }
}