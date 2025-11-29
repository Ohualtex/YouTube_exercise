import java.util.Scanner;

public class AsalKontrol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayi girin: ");
        int n = scanner.nextInt();

        if (n <= 1) {
            System.out.println(n + " asal degildir.");
            return;
        }

        boolean asalMi = true;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                asalMi = false;
                break;
            }
        }

        if (asalMi) {
            System.out.println(n + " asaldir.");
        } else {
            System.out.println(n + " asal degildir.");
        }
    }
}
