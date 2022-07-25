/*
 * Klavyeden girilen değerlere göre not ortalamasını bulan programı yazınız.
 * 
 * 
 */
import java.util.Scanner;

public class NotOrtalamasıOdev {
    public static void main(String[] args) {
        int matematik, fizik, kimya, turkce, tarih, muzik;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Matematik notunu giriniz:");
        matematik = scanner.nextInt();

        System.out.println("Fizik notunu giriniz:");
        fizik = scanner.nextInt();

        System.out.println("Kimya notunu giriniz:");
        kimya = scanner.nextInt();

        System.out.println("Türkçe notunu giriniz:");
        turkce = scanner.nextInt();

        System.out.println("Tarih notunu giriniz:");
        tarih = scanner.nextInt();
        
        System.out.println("Muzik notunu giriniz:");
        muzik = scanner.nextInt();

        int toplam = (matematik + fizik + kimya + turkce + tarih + muzik);
        double ortalama = toplam / 6;

        System.out.println((ortalama > 60) ? "Sınıfı geçti." : "Sınıfta Kaldı");

    }
}