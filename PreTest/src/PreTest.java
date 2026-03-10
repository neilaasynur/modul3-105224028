import java.util.Scanner;
public class PreTest {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner (System.in);
        System.out.print("Usia Pendonor: ");
        int usia = input.nextInt();
        System.out.print("Berat Badan Pendonor (kg): ");
        double beratBadan = input.nextDouble();
        System.out.print("Kadar Homoglobin Pendonor (g/dL): ");
        double kadarHomoglobin = input.nextDouble();

        input.close();

        if (usia >= 17){
            System.out.println("Umur pendonor memenuhi syarat untuk mendonorkan darah.");
            if (beratBadan >= 45){
                System.out.println("Berat badan pendonor memenuhi syarat untuk mendonorkan darah.");
                if (kadarHomoglobin >= 12.5){
                    System.out.println("Pendonor memenuhi semua syarat untuk mendonorkan darah.");
                } else {
                    System.out.println("Pendonor tidak memenuhi syarat karena kadar homoglobin kurang dari 12.5 g/dL!");
                }
            } else {
                System.out.println("Pendonor tidak memenuhi syarat karena berat badan kurang dari 45 kg!");
            }
        } else {
            System.out.println("Pendonor tidak memenuhi syarat karena usia kurang dari 17 tahun!");
        }

    }
}
