import java.util.Scanner;

/*
 * Java dilinde "Recursive" metot kullanarak, kullanıcıdan alınan sayının "Asal" sayı olup olmadığını bulan programı yazın.
 */
public class RecursiveAsalSayi {
    static void asalMi(int sayi, int kontrol) {
        if (kontrol == 1) {
            System.out.println("Sayı asaldır.");
            return;
        }
        if (sayi % kontrol == 0) {
            System.out.println("Asal sayı değildir.");
            return;
        }

        asalMi(sayi, --kontrol);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi;
        System.out.println("Asal sayı kontrolü yapmak istediğiniz sayıyı giriniz:");
        sayi = scanner.nextInt();
        asalMi(sayi, sayi - 1);

    }
}
