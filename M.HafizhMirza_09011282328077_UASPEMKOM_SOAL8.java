import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Soal_8_hafizhmirza_09011282328077_UASPEMKOM {
    private String username;
    private String password;
    private boolean aktif;

    public AkunPengguna(String username, String password) {
        this.username = username;
        this.password = password;
        this.aktif = true; // Secara default, akun aktif ketika dibuat.
    }

    public String getUsername() {
        return username;
    }

    public boolean cekPassword(String inputPassword) {
        return password.equals(inputPassword);
    }

    public boolean isAktif() {
        return aktif;
    }

    public void aktifkanAkun() {
        aktif = true;
        System.out.println("Akun berhasil diaktifkan.");
    }

    public void nonaktifkanAkun() {
        aktif = false;
        System.out.println("Akun berhasil dinonaktifkan.");
    }
}

public class ManajemenAkunPengguna {
    private static Map<String, AkunPengguna> akunPengguna = new HashMap<>();

    public static void main(String[] args) {
        // Membuat contoh akun pengguna
        AkunPengguna pengguna1 = new AkunPengguna("Ilham_Rama", "password123");
        AkunPengguna pengguna2 = new AkunPengguna("Rama_Ilham", "pass456");

        // Menambahkan akun ke dalam map
        akunPengguna.put(pengguna1.getUsername(), pengguna1);
        akunPengguna.put(pengguna2.getUsername(), pengguna2);

        // Mengelola akun pengguna
        kelolaAkunPengguna();
    }

    private static void kelolaAkunPengguna() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan username: ");
        String usernameInput = scanner.nextLine();

        // Memeriksa apakah username ada dalam map
        if (akunPengguna.containsKey(usernameInput)) {
            AkunPengguna pengguna = akunPengguna.get(usernameInput);

            System.out.print("Masukkan password: ");
            String passwordInput = scanner.nextLine();

            // Memeriksa kecocokan password
            if (pengguna.cekPassword(passwordInput)) {
                // Menampilkan status akun
                System.out.println("Status akun: " + (pengguna.isAktif() ? "Aktif" : "Nonaktif"));

                // Mengelola aktivasi atau deaktivasi akun
                System.out.print("Apakah Anda ingin mengaktifkan atau menonaktifkan akun? (aktif/nonaktif): ");
                String aksi = scanner.nextLine();

                if (aksi.equalsIgnoreCase("aktif")) {
                    pengguna.aktifkanAkun();
                } else if (aksi.equalsIgnoreCase("nonaktif")) {
                    pengguna.nonaktifkanAkun();
                } else {
                    System.out.println("Aksi tidak valid.");
                }
            } else {
                System.out.println("Password salah.");
            }
        } else {
            System.out.println("Akun tidak ditemukan.");
        }

        // Menutup scanner
        scanner.close();
    }
}