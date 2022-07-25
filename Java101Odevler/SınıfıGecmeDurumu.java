/*
Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik
Geçme Notu : 55
Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.
 */

import java.util.Scanner;

public class SınıfıGecmeDurumu {
    public static void main(String[] args) {
        int matematik, fizik, kimya, turkce, muzik;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Matematik notunu giriniz:");
        matematik = scanner.nextInt();
        if (matematik >= 0 && matematik <= 100) {
            matematik = matematik;
        } else {
            matematik = 0;
        }

        System.out.println("Fizik notunu giriniz:");
        fizik = scanner.nextInt();
        if (fizik >= 0 && fizik <= 100) {
            fizik = fizik;
        } else {
            fizik = 0;
        }

        System.out.println("Kimya notunu giriniz:");
        kimya = scanner.nextInt();
        if (kimya >= 0 && kimya <= 100) {
            kimya = kimya;
        } else {
            kimya = 0;
        }

        System.out.println("Türkçe notunu giriniz:");
        turkce = scanner.nextInt();
        if (turkce >= 0 && turkce <= 100) {
            turkce = turkce;
        } else {
            turkce = 0;
        }

        System.out.println("Muzik notunu giriniz:");
        muzik = scanner.nextInt();
        if (muzik >= 0 && muzik <= 100) {
            muzik = muzik;
        } else {
            muzik = 0;
        }

        double ortalama = (matematik + fizik + kimya + turkce + muzik) / 5;

        if (ortalama <= 55) {
            System.out.println("Sınıfı geçemezdiniz.");
        } else {
            System.out.println("Tebrikler...Sınıfı geçtiniz.");
        }
        System.out.println("Ortalamanız : " + ortalama);
    }
}
