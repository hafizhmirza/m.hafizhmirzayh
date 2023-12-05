import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Buku {
    private String judul;
    private String penulis;
    private int tahunTerbit;
    private boolean dipinjam;

    public Buku(String judul, String penulis, int tahunTerbit) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.dipinjam = false;
    }

    public String getJudul() {
        return judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public boolean isDipinjam() {
        return dipinjam;
    }

    public void setDipinjam(boolean dipinjam) {
        this.dipinjam = dipinjam;
    }

    public void tampilkanInfoBuku() {
        System.out.println("Judul: " + judul);
        System.out.println("Penulis: " + penulis);
        System.out.println("Tahun Terbit: " + tahunTerbit);
        System.out.println("Status: " + (dipinjam ? "Dipinjam" : "Tersedia"));
        System.out.println();
    }
}

class Perpustakaan {
    private Map<String, Buku> daftarBuku;

    public Perpustakaan() {
        this.daftarBuku = new HashMap<>();
    }

    public void tambahBuku(Buku buku) {
        daftarBuku.put(buku.getJudul(), buku);
    }

    public void tampilkanDaftarBuku() {
        System.out.println("Daftar Buku:");
        for (Buku buku : daftarBuku.values()) {
            buku.tampilkanInfoBuku();
        }
    }

    public void pinjamBuku(String judul) {
        Buku buku = daftarBuku.get(judul);
        if (buku != null && !buku.isDipinjam()) {
            buku.setDipinjam(true);
            System.out.println("Buku dengan judul '" + judul + "' berhasil dipinjam.");
        } else if (buku == null) {
            System.out.println("Buku dengan judul '" + judul + "' tidak tersedia.");
        } else {
            System.out.println("Buku dengan judul '" + judul + "' sudah dipinjam.");
        }
    }
}

public class Soal7 {
    public static void main(String[] args) {
        Buku buku1 = new Buku("Harry Potter", "J.K. Rowling", 2000);
        Buku buku2 = new Buku("Lord of the Rings", "J.R.R. Tolkien", 1954);

        Perpustakaan perpustakaan = new Perpustakaan();
        perpustakaan.tambahBuku(buku1);
        perpustakaan.tambahBuku(buku2);

        Scanner scanner = new Scanner(System.in);

        int pilihan;
        do {
            System.out.println("Menu:");
            System.out.println("1. Tampilkan Daftar Buku");
            System.out.println("2. Pinjam Buku");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu (0-2): ");

            pilihan = scanner.nextInt();
            scanner.nextLine(); // consume the newline character

            switch (pilihan) {
                case 1:
                    perpustakaan.tampilkanDaftarBuku();
                    break;
                case 2:
                    System.out.print("Masukkan judul buku yang ingin dipinjam: ");
                    String judulPinjam = scanner.nextLine();
                    perpustakaan.pinjamBuku(judulPinjam);
                    break;
                case 0:
                    System.out.println("Terima kasih! Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    break;
            }

        } while (pilihan != 0);

        scanner.close();
    }
}
