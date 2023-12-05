import java.util.Stack;

public class Soal9 {

    public static void main(String[] args) {
        String ekspresi = "(a + b) * (c - d)";

        // Inisialisasi stack
        Stack<Character> stack = new Stack<>();

        // Periksa setiap karakter dalam ekspresi
        for (int i = 0; i < ekspresi.length(); i++) {
            char karakter = ekspresi.charAt(i);

            // Jika karakter adalah kurung buka, tambahkan ke stack
            if (karakter == '(') {
                stack.push(karakter);
            }

            // Jika karakter adalah kurung tutup, keluarkan dari stack
            else if (karakter == ')') {
                if (stack.empty() || stack.peek() != '(') {
                    System.out.println("Urutan kurung tidak benar");
                    return;
                }

                stack.pop();
            }
        }

        // Jika stack masih berisi kurung, maka urutan kurung tidak benar
        if (!stack.empty()) {
            System.out.println("Urutan kurung tidak benar");
        } else {
            System.out.println("Urutan kurung benar");
        }
    }
}
