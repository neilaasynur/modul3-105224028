import java.util.Scanner;
public class Kiosk {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner (System.in);
        char tiket;
        int age, price, stok1 = 5, stok2 = 25, stok3 = 35, totalTiket, totalPrice, tiketLolos;

        do {
            System.out.println("===== KIOSK TICKET CATEGORY =====\n1. VIP (" + stok1 + ")\n2. Festival (" + stok2 + ")\n3. Tribune (" + stok3 + ")\n4. Matikan Mesin ");
            System.out.print("Pilih kategori tiket : ");
            tiket = input.next().charAt(0);
            if (tiket == '4') {
                System.out.println(" >> Mesin dimatikan. Terima kasih! <<");
                break;
            }
            switch (tiket) {
                case '1':
                    System.out.print("Input banyak tiket yang mau di beli: ");
                    totalTiket = input.nextInt();
                    totalPrice = 0;
                    tiketLolos = 0;
                    price = 1500000;
                    if (totalTiket > stok1) {
                        System.out.println("\n>> Maaf, stok tiket VIP tidak mencukupi!\n");
                        break;
                    }
                    int i = 1;
                    while (i <= totalTiket) {
                        System.out.print("Input usia untuk tiket ke-" + i + ": ");
                        age = input.nextInt();
                        if (age == -1) break;
                        if (age <= 0 || age > 100) {
                            System.out.println("Usia tidak logis. Silakan masukkan kembali");
                        } else if (age >= 18) {
                                System.out.println(">> Verifkikasi tiket ke-" + i + " selesai!" );
                                stok1--;
                                totalPrice += price;
                                tiketLolos++;
                                i++;
                        } else {
                            System.out.println(">> Maaf, usia belum mencukupi!");
                            i++;
                        }
                    }
                    System.out.println("\n===== NOTA PEMBELIAN TIKET =====\nKategori tiket: VIP\nTiket yang dicoba: " + totalTiket + "\nTiket Lolos Verifikasi: " + tiketLolos + 
                    "\n------------------------------\nTotal Tagihan: Rp" + totalPrice + "\n");
                    break;
                case '2':
                    System.out.print("Input banyak tiket yang mau di beli: ");
                    totalTiket = input.nextInt();
                    totalPrice = 0;
                    tiketLolos = 0;
                    price = 800000;
                    if (totalTiket > stok2) {
                        System.out.println("\n>> Maaf, stok tiket Festival tidak mencukupi!\n");
                        break;
                    }
                    i = 1;
                    while (i <= totalTiket) {
                        System.out.print("Input usia untuk tiket ke-" + i + ": ");
                        age = input.nextInt();
                        if (age == -1) break;
                        if (age > 100) {
                            System.out.println("Usia tidak logis. Silakan masukkan kembali");
                        } else if (age >= 15) {
                                System.out.println(">> Verifkikasi tiket ke-" + i + " selesai!" );
                                stok2--;
                                totalPrice += price;
                                tiketLolos++;
                                i++;
                        } else {
                            System.out.println(">> Maaf, usia belum mencukupi!");
                            i++;
                        }
                    }
                    System.out.println("\n===== NOTA PEMBELIAN TIKET =====\nKategori tiket: Festival\nTiket yang dicoba: " + totalTiket + "\nTiket Lolos Verifikasi: " + tiketLolos + 
                    "\n------------------------------\nTotal Tagihan: Rp" + totalPrice + "\n");
                    break;
                case '3':
                    System.out.print("Input banyak tiket yang mau di beli: ");
                    totalTiket = input.nextInt();
                    totalPrice = 0;
                    tiketLolos = 0;
                    price = 500000;
                    if (totalTiket > stok3) {
                        System.out.println("\n>> Maaf, stok tiket Tribune tidak mencukupi!\n");
                        break;
                    }
                    i = 1;
                    while (i <= totalTiket) {
                        System.out.print("Input usia untuk tiket ke-" + i + ": ");
                        age = input.nextInt();
                        if (age == -1) break;
                        if (age > 100) {
                            System.out.println("Usia tidak logis. Silakan masukkan kembali");
                        } else {
                                System.out.println(">> Verifkikasi tiket ke-" + i + " selesai!" );
                                stok3--;
                                totalPrice += price;
                                tiketLolos++;
                                i++;
                        }
                    }
                    System.out.println("\n===== NOTA PEMBELIAN TIKET =====\nKategori tiket: Tribune\nTiket yang dicoba: " + totalTiket + "\nTiket Lolos Verifikasi: " + tiketLolos + 
                    "\n------------------------------\nTotal Tagihan: Rp" + totalPrice + "\n");
                    break;
                default:
                    System.out.println(">> Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (true);
    }
}