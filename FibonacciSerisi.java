import java.util.Scanner;

public class FibonacciSerisi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kac terimlik Fibonacci serisi yazilsin? n = ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("n pozitif olmali.");
            return;
        }

        int a = 0;
        int b = 1;

        if (n >= 1) {
            System.out.print(a + " ");
        }
        if (n >= 2) {
            System.out.print(b + " ");
        }

        for (int i = 3; i <= n; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }

        System.out.println(); // satir sonu
    }
}

