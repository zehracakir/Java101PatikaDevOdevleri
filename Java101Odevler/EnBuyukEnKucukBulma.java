import java.util.Scanner;

/*
 * Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları bulan ve bu sayıları ekrana yazan programı yazın.

Senaryo
Kaç tane sayı gireceksiniz: 4
1. Sayıyı giriniz: 16
2. Sayıyı giriniz: -22
3. Sayıyı giriniz: -15
4. Sayıyı giriniz: 100
En büyük sayı: 100
En küçük sayı: -22

 */
public class EnBuyukEnKucukBulma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int enKucuk, enBuyuk, gecici, sayiAdeti, sayi;

        System.out.println("Kaç adet sayı gireceksiniz?");
        sayiAdeti = scanner.nextInt();
        System.out.println("Sayı giriniz: ");
        sayi = scanner.nextInt();
        enBuyuk = sayi;
        enKucuk = sayi;

        for (int i = sayiAdeti; i > 1; i--) {
            System.out.println("Sayı giriniz: ");
            sayi = scanner.nextInt();
            if (sayi > enBuyuk) {
                enBuyuk = sayi;

            }
            if (sayi < enKucuk) {
                enKucuk = sayi;
            }

        }
        System.out.println("En buyuk sayi= " + enBuyuk);
        System.out.println("En kucuk sayi= " + enKucuk);

    }
}
