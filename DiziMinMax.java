import java.util.Scanner;

public class DiziMinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kac adet sayi gireceksiniz? ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Eleman sayisi pozitif olmali.");
            return;
        }

        System.out.print("1. sayiyi girin: ");
        int sayi = scanner.nextInt();

        int enBuyuk = sayi;
        int enKucuk = sayi;

        for (int i = 2; i <= n; i++) {
            System.out.print(i + ". sayiyi girin: ");
            sayi = scanner.nextInt();

            if (sayi > enBuyuk) {
                enBuyuk = sayi;
            }
            if (sayi < enKucuk) {
                enKucuk = sayi;
            }
        }

        System.out.println("En buyuk sayi: " + enBuyuk);
        System.out.println("En kucuk sayi: " + enKucuk);
    }
}

