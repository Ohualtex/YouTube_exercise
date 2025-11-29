import java.util.Scanner;

public class GeometrikSekilHesaplayici {

    // Kare hesaplama metodu
    public static void kareHesapla(double a) {
        double kareAlan = a * a;
        double kareCevre = 4 * a;
        System.out.println("== KARE HESAPLAMASI ==");
        System.out.println("Kenar: " + a);
        System.out.println("Kare alani: " + kareAlan);
        System.out.println("Kare cevresi: " + kareCevre);
    }

    // Dikdortgen hesaplama metodu
    public static void dikdortgenHesapla(double kisa, double uzun) {
        double dikAlan = kisa * uzun;
        double dikCevre = 2 * (kisa + uzun);
        System.out.println("== DIKDORTGEN HESAPLAMASI ==");
        System.out.println("Kisa kenar: " + kisa + ", Uzun kenar: " + uzun);
        System.out.println("Dikdortgen alani: " + dikAlan);
        System.out.println("Dikdortgen cevresi: " + dikCevre);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Geometrik Sekil Hesaplayici");
        System.out.println("1) Kare (alan ve cevre)");
        System.out.println("2) Dikdortgen (alan ve cevre)");
        System.out.println("3) Daire (alan ve cevre)");
        System.out.println("4) Kup (hacim ve yuzey alani)");
        System.out.println("5) Silindir (hacim ve alan)");
        System.out.print("Seciminiz: ");

        int secim = scanner.nextInt();

        switch (secim) {
            case 1: // Kare
                System.out.print("Karenin bir kenar uzunlugunu girin: ");
                double a = scanner.nextDouble();
                if (a < 0) {
                    System.out.println("Kenar uzunlugu negatif olamaz.");
                    return;
                }
                kareHesapla(a);
                break;

            case 2: // Dikdörtgen
                System.out.print("Kisa kenari girin: ");
                double kisa = scanner.nextDouble();
                System.out.print("Uzun kenari girin: ");
                double uzun = scanner.nextDouble();

                if (kisa < 0 || uzun < 0) {
                    System.out.println("Kenar uzunluklari negatif olamaz.");
                    return;
                }

                // Eger esitlerse: bu aslinda kare, kare case'ine yonlendir
                if (kisa == uzun) {
                    System.out.println("Girilen degerlerle olusan sekil dikdortgen degil, KARE'dir.");
                    kareHesapla(kisa);   // veya uzun, fark etmez
                    break;
                }

                // kisa > uzun ise yer degistir
                if (kisa > uzun) {
                    System.out.println("Uyari: Kisa kenar uzun kenardan buyuk girildi, yerleri degistiriyorum.");
                    double temp = kisa;
                    kisa = uzun;
                    uzun = temp;
                }

                dikdortgenHesapla(kisa, uzun);
                break;

            case 3: // Daire
                System.out.print("Dairenin yaricapini girin: ");
                double r = scanner.nextDouble();
                if (r < 0) {
                    System.out.println("Yaricap negatif olamaz.");
                    return;
                }
                double daireAlan = Math.PI * r * r;
                double daireCevre = 2 * Math.PI * r;
                System.out.println("Daire alani: " + daireAlan);
                System.out.println("Daire cevresi: " + daireCevre);
                break;

            case 4: // Küp
                System.out.print("Kupun bir kenar uzunlugunu girin: ");
                double kenar = scanner.nextDouble();
                if (kenar < 0) {
                    System.out.println("Kenar uzunlugu negatif olamaz.");
                    return;
                }
                double kupHacim = kenar * kenar * kenar;
                double kupYuzeyAlan = 6 * kenar * kenar;
                System.out.println("Kup hacmi: " + kupHacim);
                System.out.println("Kup yuzey alani: " + kupYuzeyAlan);
                break;

            case 5: // Silindir
                System.out.print("Silindirin yaricapini girin: ");
                double rs = scanner.nextDouble();
                System.out.print("Silindirin yuksekligini girin: ");
                double h = scanner.nextDouble();
                if (rs < 0 || h < 0) {
                    System.out.println("Yaricap ve yukseklik negatif olamaz.");
                    return;
                }
                double silindirHacim = Math.PI * rs * rs * h;
                double silindirYanAlan = 2 * Math.PI * rs * h;
                double silindirTabanAlani = Math.PI * rs * rs;
                double silindirToplamAlan = 2 * silindirTabanAlani + silindirYanAlan;

                System.out.println("Silindir hacmi: " + silindirHacim);
                System.out.println("Silindir yan alani: " + silindirYanAlan);
                System.out.println("Silindir toplam alan (2 taban + yan): " + silindirToplamAlan);
                break;

            default:
                System.out.println("Gecersiz secim yaptiniz.");
        }
    }
}
