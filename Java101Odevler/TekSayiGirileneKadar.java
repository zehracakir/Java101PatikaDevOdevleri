import java.util.Scanner;

/*
 * Ödev
Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen 
değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
 */
public class TekSayiGirileneKadar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi, toplam = 0;

        while (true) {
            System.out.println("Sayi giriniz:");
            sayi = scanner.nextInt();
            if (sayi % 2 != 0) {
                break;
            } else {
                if (sayi % 4 == 0) {
                    toplam += sayi;
                }
            }
        }
        System.out.println("Toplam= " + toplam);
    }

}
