import java.util.Scanner;

/*
 * Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın.
 *  Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın. 
 * Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını hesaplayın 
 ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
 */
public class UcakBiletiFiyatıHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double indirimsizFiyat, indirimliFiyat;
        int km, yas, yolculukTipi;

        System.out.println("Mesafe kaç km?");
        km = scanner.nextInt();

        System.out.println("Yaşınız kaç?");
        yas = scanner.nextInt();

        System.out.println("Yolculuk tipiniz? (1-tek yön 2-gidiş-dönüş): ");
        yolculukTipi = scanner.nextInt();

        if (km > 0 && yas > 0) {
            if (yolculukTipi == 1) {
                indirimsizFiyat = km * 0.10;
                System.out.println(indirimsizFiyat);
            } else {
                indirimsizFiyat = km * 0.10 * 2;
                indirimliFiyat = indirimsizFiyat - indirimsizFiyat * 0.2;
            }
            System.out.println("İndirimsiz fiyat: " + indirimsizFiyat);
            if (yas < 12) {
                indirimliFiyat = indirimsizFiyat - indirimsizFiyat * 0.5;

            } else if (yas >= 12 && yas <= 24) {
                indirimliFiyat = indirimsizFiyat - indirimsizFiyat * 0.1;
            } else if (yas > 65) {
                indirimliFiyat = indirimsizFiyat - indirimsizFiyat * 0.3;
            } else {
                indirimliFiyat = indirimsizFiyat;
            }
            System.out.println("indirimli bilet fiyatı: " + indirimliFiyat);

        } else {
            System.out.println("Hatalı giriş yaptınız!");
        }
    }
}
