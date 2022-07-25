import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        double n1, n2;
        int select;

        Scanner scanner = new Scanner(System.in);

        System.out.println("İlk sayıyı giriniz: ");
        n1 = scanner.nextInt();

        System.out.println("İkinci sayıyı giriniz: ");
        n2 = scanner.nextInt();

        System.out.println("Yapılacak işlemi seçiniz: ");
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        select = scanner.nextInt();

        switch (select) {
            case 1:
                System.out.println("Toplam sonucu = " + (n1 + n2));
                break;
            case 2:
                System.out.println("Çıkarma sonucu = " + (n1 - n2));
                break;
            case 3:
                System.out.println("Çarpma sonucu = " + (n1 * n2));
                break;
            case 4:
                if (n2 == 0) {
                    System.out.println("Hata : 0'a bölmeye çalışıyorsunuz!");
                } else {
                    System.out.println("Bölme sonucu = " + (n1 / n2));
                }

        }

    }
}
