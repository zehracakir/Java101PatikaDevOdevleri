/*
 * Kombinasyon hesaplayan programı yazınız.
 */
import java.util.Scanner;

public class KombinasyonHesaplama {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("N Değerini Giriniz");
        int n = scanner.nextInt();

        System.out.println("R Değerini Giriniz");
        int r = scanner.nextInt();

        if (n < r) {

            System.out.println("N Sayısı R Sayısından Büyük Olmalıdır. Lütfen Tekrar N Değerini Giriniz.");
            n = scanner.nextInt();
            KombinasyonHesapla(n, r);
        } else {
            KombinasyonHesapla(n, r);
        }
    }

    private static void KombinasyonHesapla(int n, int r) {

        int faktoriyel_1 = 1;
        int faktoriyel_2 = 1;
        int faktoriyel_3 = 1;
        int fark = n - r;

        for (int i = 1; i <= n; i++) {

            faktoriyel_1 = faktoriyel_1 * i;
        }
        System.out.println("N Sayısının Faktöriyeli : " + faktoriyel_1);

        for (int j = 1; j <= r; j++) {

            faktoriyel_2 = faktoriyel_2 * j;
        }
        System.out.println("R Sayısının Faktöriyeli : " + faktoriyel_2);

        for (int k = 1; k <= fark; k++) {

            faktoriyel_3 = faktoriyel_3 * k;
        }
        System.out.println("(N-R)'nin Faktöriyeli : " + faktoriyel_3);

        int carpim = faktoriyel_2 * faktoriyel_3;
        int kombinasyon = faktoriyel_1 / carpim;

        System.out.println(n + " Sayısının " + r + "'li" + " Kombinasyonu = " + kombinasyon);
    }

}
