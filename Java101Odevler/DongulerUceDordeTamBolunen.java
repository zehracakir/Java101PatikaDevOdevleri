import java.util.Scanner;

/*
Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan
 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız. */

public class DongulerUceDordeTamBolunen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, toplam = 0, adet = 0;
        double ortalama;

        System.out.println("bir sayı giriniz: ");
        a = scanner.nextInt();

        for (int i = 0; i <= a; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                toplam += i;
                adet++;
            }
        }
        ortalama = toplam / adet;
        System.out.println("0 dan " + a + " ya kadar olan sayılardan 3 ve 4 e bölünenlerin ortalaması= " + ortalama);

    }
}