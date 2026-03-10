import java.util.Scanner;
public class PostTest {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int saldoAwal = 500000;
        do {
            System.out.println("\nMenu: 1. Cek Saldo | 2. Setor Tunai | 3. Tarik Tunai | 4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Saldo Anda: " + saldoAwal);
                    break;
                case 2:
                    System.out.print("Masukkan jumlah setor tunai: ");
                    int setor = input.nextInt();
                    saldoAwal += setor;
                    System.out.println("Transaksi berhasil!");
                    break;
                case 3:
                    System.out.print("Masukkan jumlah tarik tunai: ");
                    int tarik = input.nextInt();
                    int saldoTentatif = saldoAwal - tarik;

                    if (saldoTentatif < 50000){
                        System.out.println("Peringatan! Transaksi ini membuat saldo Anda kurang dari saldo minimal. Transaksi otomatis dibatalkan!"); 
                    } else {
                        saldoAwal = saldoTentatif;
                        System.out.println("Penarikan berhasil!");
                    }
                    break;
                case 4:
                    System.out.println("Terimakasih telah menggunakan layanan kami!");
                    input.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (true);
    }
}
