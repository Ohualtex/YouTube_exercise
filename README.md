-------------------------------------------------------------------------------------------------------------------------------------------------------------------
Birinci problem: 1’den n’e kadar olan sayıların toplamı

İlk problemimiz çok klasik ama önemli:
“Kullanıcıdan pozitif bir n sayısı alıyoruz ve 1’den n’e kadar olan sayıların toplamını buluyoruz.”

Girdi olarak bir tane n değerimiz var. Çıktımız ise 1 + 2 + 3 + … + n olacak.

Bunu iki farklı şekilde düşünebiliriz:
Birincisi, döngü yardımıyla; ikincisi formülle.

Döngülü çözümde algoritmamız şöyle:

Kullanıcıdan n değerini al.

toplam adında bir değişken tanımla ve 0 yap.

1’den n’e kadar bir döngü çalıştır. Her adımda toplam = toplam + i yap.

Döngü bittiğinde toplam değerini ekrana yazdır.

Formüllü çözümde ise, matematikten bildiğimiz
toplam = n * (n + 1) / 2 formülünü kullanabiliriz.

Mesela n = 5 girilirse, toplam 1 + 2 + 3 + 4 + 5 = 15 çıkar.
Bu problem bize hem döngüleri hem de bazen tek satırlık bir formülle aynı işi yapabildiğimizi gösteriyor.
-------------------------------------------------------------------------------------------------------------------------------------------------------------------
İkinci problem: Dizideki en büyük ve en küçük sayıyı bulma

İkinci problemimizde kullanıcıdan n tane tam sayı almamızı ve bu sayılar içinden en büyük ve en küçük olanı bulmamızı istiyoruz.

Girdiler:

n sayısı, yani kaç tane eleman var

Daha sonra girilen n tane tam sayı

Çıktılar:

enBuyuk

enKucuk

Algoritmanın adımları şöyle:

Kullanıcıdan n değerini al.

İlk sayıyı oku; hem enBuyuk hem de enKucuk değişkenine ata.

Kalan n - 1 sayı için bir döngü kur:

Yeni sayıyı x olarak oku.

Eğer x > enBuyuk ise enBuyuk = x yap.

Eğer x < enKucuk ise enKucuk = x yap.

Döngü bittiğinde enBuyuk ve enKucuk değerlerini ekrana yazdır.

Örneğin sayılarımız 3, 10, -2 ve 7 olsun:

Başta en büyük 3, en küçük 3.

10’u okuyunca en büyük 10 olur.

-2’yi okuyunca en küçük -2 olur.

7’yi okuyunca bir şey değişmez.

Sonuçta en büyük 10, en küçük -2’dir.
Bu problem tek geçişte hem minimum hem maksimum bulma mantığını pekiştiriyor.
-------------------------------------------------------------------------------------------------------------------------------------------------------------------
Üçüncü problem: Asal sayı kontrolü

Üçüncü problemde kullanıcının girdiği bir sayının asal olup olmadığını kontrol ediyoruz.

Asal sayı tanımı: 1’den büyük olacak ve yalnızca 1’e ve kendisine tam bölünecek.

Algoritmamız şöyle:

Kullanıcıdan n sayısını al.

Eğer n <= 1 ise, zaten asal değildir, bunu yazdır ve bitir.

asalMi adında bir boolean değişken tanımla ve true yap.

i = 2’den başlayarak i * i <= n olana kadar bir döngü kur:

Eğer n % i == 0 ise, yani n sayısı i’ye tam bölünüyorsa:

asalMi = false yap ve döngüden çık.

Döngü bittikten sonra:

Eğer asalMi hâlâ true ise “n asaldır” yazdır.

Değilse “n asal değildir” yazdır.

Örneğin n = 12 için 2’ye tam bölünebildiğini görürüz, bu yüzden asal değildir.
n = 13 için ise 2, 3, 4 denenir; hiçbirine tam bölünmediği için 13 asaldır.

Burada dikkat ettiğimiz nokta, 2’den n’e kadar gitmek yerine, sadece kareköküne kadar kontrol ederek algoritmayı daha verimli hale getirmemiz.
-------------------------------------------------------------------------------------------------------------------------------------------------------------------
Dördüncü problem: Geometrik şekillerin alan, çevre ve hacim hesaplaması

Dördüncü problemde biraz daha matematiksel bir örnek yapalım.
Sorumuz şu:
“Kullanıcının seçtiği geometrik şeklin alanını, çevresini veya hacmini hesaplayan bir program yazınız.”

Örnek olarak şunları desteklediğimizi varsayalım:

Kare: alan ve çevre

Dikdörtgen: alan ve çevre

Daire: alan ve çevre

Küp: hacim

Silindir: hacim ve yan alan gibi değerler

Tabii videoda hepsini tek tek kodlamak yerine, genel algoritma mantığını anlatacağım.

Algoritmanın genel akışı şöyle:

Kullanıcıya bir menü göster:
1 – Kare
2 – Dikdörtgen
3 – Daire
4 – Küp
5 – Silindir

Kullanıcıdan hangi şekil için işlem yapmak istediğini al, mesela secim değişkeni.

switch veya if-else yapısı ile her seçeneği ayrı ayrı ele al:

Eğer seçim kare ise:

Kullanıcıdan karenin bir kenar uzunluğunu a olarak al.

Alan = a * a

Çevre = 4 * a

Sonuçları ekrana yazdır.

Eğer seçim dikdörtgen ise:

Kullanıcıdan kısa kenar kisa, uzun kenar uzun değerlerini al.

Alan = kisa * uzun

Çevre = 2 * (kisa + uzun)

Sonuçları yazdır.

Eğer seçim daire ise:

Kullanıcıdan yarıçap r değerini al.

Alan = π * r * r (programda genellikle Math.PI kullanırız)

Çevre = 2 * π * r

Sonuçları yazdır.

Eğer seçim küp ise:

Kullanıcıdan bir kenar uzunluğunu a olarak al.

Hacim = a * a * a

İstersen toplam yüzey alanı da hesaplanabilir: 6 * a * a

Sonuçları ekrana yazdır.

Eğer seçim silindir ise:

Kullanıcıdan yarıçap r ve yükseklik h al.

Hacim = π * r * r * h

Yan alan = 2 * π * r * h

Toplam alan istenirse: 2 * π * r * r + 2 * π * r * h

Sonuçları yazdır.

Eğer kullanıcı menüde olmayan bir değer girerse, “Geçersiz seçim” diye uyar.

Bu problemde, hem matematikte gördüğünüz alan–çevre–hacim formüllerini kullanıyoruz hem de programlama tarafında menü tasarımı, kullanıcıdan veri alma ve koşul yapılarıyla çalışmayı tekrar etmiş oluyoruz.
-------------------------------------------------------------------------------------------------------------------------------------------------------------------
Beşinci problem: Fibonacci serisinin ilk n terimini yazdırma

Son problemimiz Fibonacci serisiyle ilgili.
Fibonacci serisi, her sayının kendisinden önce gelen iki sayının toplamı olduğu bir dizi:
0, 1, 1, 2, 3, 5, 8, 13, …

Burada kullanıcıdan n alıp Fibonacci serisinin ilk n terimini ekrana yazdıracağız.

Algoritmamız şöyle:

Kullanıcıdan n değerini al.

Eğer n <= 0 ise, “n pozitif olmalı” deyip bitir.

a = 0, b = 1 olarak ilk iki terimi tanımla.

Eğer n >= 1 ise a değerini ekrana yazdır.

Eğer n >= 2 ise b değerini ekrana yazdır.

i = 3’ten n’e kadar bir döngü kur:

c = a + b

c’yi ekrana yazdır

Sonra a = b, b = c yap ve devam et.

Örneğin n = 5 girildiğinde ekranda 0, 1, 1, 2, 3 yazmasını bekleriz.

Bu problem, önceki değerleri hatırlayarak yeni bir değer üretmenin güzel bir örneği.
-------------------------------------------------------------------------------------------------------------------------------------------------------------------
