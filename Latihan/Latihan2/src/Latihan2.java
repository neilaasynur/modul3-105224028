import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner (System.in);

        String PIN = "64532";

        System.out.println("Program ini meminta untuk memasukkan PIN dengan maksimal percobaan sebanyak 3 kali!\nHint: Angka PIN berisi 5 angka");
        int i = 1;
        do {
            System.out.print("Masukkan PIN untuk percobaan ke-" + i + ": ");
            String pin = input.nextLine();

            if (pin.equals(PIN)) {
                System.out.println("PIN benar! Akses diterima.");
                break;
            } else {
                if (i == 3) {
                    System.out.println("Akun diblokir");
                    break;
                }
                System.out.println("PIN salah! Coba lagi.");
            }
            i++;
        } while (true);
    }
}
