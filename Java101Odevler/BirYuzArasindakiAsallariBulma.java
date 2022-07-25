import java.util.Scanner;

/*
 * Java ile 1 - 100 arasındaki asal sayıları ekrana yazdıran programı yazınız.

Senaryo
2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97 

 */
public class BirYuzArasindakiAsallariBulma {
    public static void main(String[] args) {
        int adet = 0;

        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    adet++;
                }
            }
            if (adet == 2) {
                System.out.println(i + " Sayisi asaldir.");
            }
            adet = 0;

        }

    }
}
