//------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Döngü ile çözüm
import java.util.Scanner;

public class Toplam1denN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("n degerini girin: ");
        int n = scanner.nextInt();

        if (n < 1) {
            System.out.println("n en az 1 olmali.");
            return;
        }

        int toplam = 0;
        for (int i = 1; i <= n; i++) {
            toplam += i;
        }

        System.out.println("1'den " + n + "'e kadar olan sayilarin toplami: " + toplam);
    }
}

//------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Formül ile çözüm
import java.util.Scanner;

public class Toplam1denN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("n degerini girin: ");
        int n = scanner.nextInt();

        if (n < 1) {
            System.out.println("n pozitif ve en az 1 olmali.");
            return;
        }
        // long kullanmak daha guvenli, cunku n buyuk olursa carpim tasabilir
        long toplam = (long) n * (n + 1) / 2;

        System.out.println("1'den " + n + "'e kadar olan sayilarin toplami: " + toplam);
    }
}
