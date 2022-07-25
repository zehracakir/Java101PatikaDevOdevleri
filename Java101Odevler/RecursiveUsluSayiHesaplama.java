import java.util.Scanner;

/*
 * Recursive Metotlar ile Üslü Sayı Hesaplama
Java dilinde, taban ve üs değerleri kullanıcıdan alınan üs alma işlemini "Recursive" metot kullanarak yapan programı yazınız.

Senaryo

Taban değeri giriniz :2
Üs değerini giriniz : 0
Sonuç : 1
Taban değeri giriniz : 2
Üs değerini giriniz : 3
Sonuç : 8
Taban değeri giriniz : 5
Üs değerini giriniz : 3
Sonuç : 125
 */
public class RecursiveUsluSayiHesaplama {
    static int usluSayiHesapla(int sayi, int us) {
        int ussuAlinanSayi;
        if (us == 1) {
            return sayi;

        }
        return sayi * usluSayiHesapla(sayi, --us);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi, us;
        System.out.println("Sayi giriniz:");
        sayi = scanner.nextInt();
        System.out.println("Girilen sayının kaçıncı üssünü bulmak istiyorsunuz?");
        us = scanner.nextInt();
        System.out.println(sayi + " ^ " + us + " = " + usluSayiHesapla(sayi, us));

    }
}
