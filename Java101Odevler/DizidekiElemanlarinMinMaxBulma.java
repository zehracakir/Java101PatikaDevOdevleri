import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/*
Dizideki elemanların girilen sayıdan küçük en yakın sayıyı ve en büyük en yakın sayıyı bulan programı yazınız.

Dizi : {15,12,788,1,-1,-778,2,0}
Girilen Sayı : 5
Girilen sayıdan küçük en yakın sayı : 2
Girilen sayıdan büyük en yakın sayı : 12
 */
public class DizidekiElemanlarinMinMaxBulma {
    public static void main(String[] args) {
        int[] dizi = { 15, 12, 788, 1, -1, -778, 2, 0 };
        int min = dizi[0];
        int max = dizi[0];
        int sayi;
        Scanner scanner = new Scanner(System.in);

        System.out.println(Arrays.toString(dizi));
        System.out.println("Lütfen Bir sayi Giriniz :");
        sayi = scanner.nextInt();

        Arrays.sort(dizi);
        for (int i : dizi) {
            if (i < sayi) {
                min = i;
            }

            if (i > sayi) {
                max = i;
                break;
            }
        }

        System.out.println("Girilen sayıdan küçük en yakın sayı : " + min);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + max);

    }
}
