import java.util.Scanner;
public class Nomor1 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner (System.in);
        System.out.println("Program ini meminta untuk memasukkan dua bilangan desimal dan satu operator matematika (+, -, *, /) ");
        System.out.print("Masukkan bilangan pertama: ");
        double bil1 = input.nextDouble();
        System.out.print("Masukkan bilangan kedua: ");
        double bil2 = input.nextDouble();
        System.out.print("Masukkan operator matematika (+, -, *, /): ");
        String operator = input.next();

        input.close();

        switch (operator) {
            case "+":
                System.out.println("Hasil: " + (bil1 + bil2));
                break;
            case "-":
                System.out.println("Hasil: " + (bil1 - bil2));
                break;
            case "*":
                System.out.println("Hasil: " + (bil1 * bil2));
                break;
            case "/":
                if (bil2 != 0) {
                    System.out.println("Hasil: " + (bil1 / bil2));
                } else {
                    System.out.println("Error: Pembagian dengan nol tidak diizinkan.");
                }
                break;
            default:
                System.out.println("Error: Operator tidak valid!");
        }
    }
}
