
/* KDV Tutarı Hesaplayan Program
Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.

(Not : KDV tutarını 18% olarak alın)

KDV'siz Fiyat = 10;

KDV'li Fiyat = 11.8;

KDV tutarı = 1.8;

Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.*/
import java.util.Scanner;

public class KDVHesaplayanProgram {
    public static void main(String[] args) {
        double kdvOran, kdv, kdvsizFiyat, kdvliFiyat;
        boolean kdvDurumu;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Para miktarını giriniz:");
        kdvsizFiyat = scanner.nextDouble();

        kdvDurumu = (0 < kdvsizFiyat) && (kdvsizFiyat < 1000);
        kdvOran = kdvDurumu ? 0.18d : 0.08;

        kdv = kdvsizFiyat * kdvOran;
        kdvliFiyat = kdv + kdvsizFiyat;

        System.out.println("KDV siz fiyat : " + kdvsizFiyat);
        System.out.println("KDV miktarı : " + kdv);
        System.out.println("KDV li miktar : " + kdvliFiyat);
    }
}