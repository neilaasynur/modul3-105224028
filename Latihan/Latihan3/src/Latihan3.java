public class Latihan3 {
    public static void main(String[] args) throws Exception {
        System.out.println("Program ini akan mengeluarkan angka yang bukan kelipatan 3 dan kelipatan 5");
        System.out.println("Angka-angka yang memenuhi syarat adalah: ");
        for (int i = 1; i <= 50; i++) {
            if (i % 3 == 0) {
                continue;
            } else if (i % 5 == 0) {
                continue;
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
