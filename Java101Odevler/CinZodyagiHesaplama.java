import java.util.Scanner;

/*
 * Çin Zodyağı nedir?

4000 bin yıldır kullanılan bir astroloji çeşididir Çin astrolojisi ve insanları 12 değişik burç ve
sembollerle tanımlar. 
Çin Zodyağı bu 12 burcun eşit aralıklarla(10 derece genişliğinde) sıralandığı bir hayvan halkasıdır ve
 yıldızlarla pek bir ilgisi yoktur.

Çin Zodyağı nasıl hesaplanır?

Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.

Doğum Tarihi %12 = 0 ➜ Maymun

Doğum Tarihi %12 = 1 ➜ Horoz

Doğum Tarihi %12 = 2 ➜ Köpek

Doğum Tarihi %12 = 3 ➜ Domuz

Doğum Tarihi %12 = 4 ➜ Fare

Doğum Tarihi %12 = 5 ➜ Öküz

Doğum Tarihi %12 = 6 ➜ Kaplan

Doğum Tarihi %12 = 7 ➜ Tavşan

Doğum Tarihi %12 = 8 ➜ Ejderha

Doğum Tarihi %12 = 9 ➜ Yılan

Doğum Tarihi %12 = 10 ➜ At

Doğum Tarihi %12 = 11 ➜ Koyun
 */
public class CinZodyagiHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dogumYili, cinZodyagi;

        System.out.println("Doğum yılınızı giriniz:");
        dogumYili = scanner.nextInt();

        cinZodyagi = dogumYili % 12;

        if (cinZodyagi == 0) {
            System.out.println("Çin zodyağı burcunuz : Maymun");
        } else if (cinZodyagi == 1) {
            System.out.println("Çin zodyağı burcunuz : Horoz");
        } else if (cinZodyagi == 2) {
            System.out.println("Çin zodyağı burcunuz : Köpek");
        } else if (cinZodyagi == 3) {
            System.out.println("Çin zodyağı burcunuz : Domuz");
        } else if (cinZodyagi == 4) {
            System.out.println("Çin zodyağı burcunuz : Fare");
        } else if (cinZodyagi == 5) {
            System.out.println("Çin zodyağı burcunuz : Öküz");
        } else if (cinZodyagi == 6) {
            System.out.println("Çin zodyağı burcunuz : Kaplan");
        } else if (cinZodyagi == 7) {
            System.out.println("Çin zodyağı burcunuz : Tavşan");
        } else if (cinZodyagi == 8) {
            System.out.println("Çin zodyağı burcunuz : Ejderha");
        } else if (cinZodyagi == 9) {
            System.out.println("Çin zodyağı burcunuz : Yılan");
        } else if (cinZodyagi == 10) {
            System.out.println("Çin zodyağı burcunuz : At");
        } else if (cinZodyagi == 11) {
            System.out.println("Çin zodyağı burcunuz : Koyun");
        }

    }
}
