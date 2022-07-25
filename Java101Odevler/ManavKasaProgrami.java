/*
 * Klavyeden girilen değerlere göre müşterinin ödeyeceği miktarı bulan programı yazınız. 
 */
import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {
        double armut, elma, domates, muz, patlican, toplamTutar;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kaç kg armut aldınız?: ");
        armut = scanner.nextDouble();

        System.out.println("Kaç kg elma aldınız?: ");
        elma = scanner.nextDouble();

        System.out.println("Kaç kg domates aldınız?: ");
        domates = scanner.nextDouble();

        System.out.println("Kaç kg muz aldınız?: ");
        muz = scanner.nextDouble();

        System.out.println("Kaç kg patlıcan aldınız?: ");
        patlican = scanner.nextDouble();

        toplamTutar = armut * 2.14 + elma * 3.67 + domates * 1.11 + muz * 0.95 + patlican * 5.0;

        System.out.println("Toplam tutar : " + toplamTutar);

    }
}
