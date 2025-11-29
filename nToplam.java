
import java.util.Scanner;

public class Toplam1denN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("n degerini girin: ");
        int n = scanner.nextInt();

        int toplam = 0;
        for (int i = 1; i <= n; i++) {
            toplam += i;
        }

        System.out.println("1'den " + n + "'e kadar olan sayilarin toplami: " + toplam);
    }
}
