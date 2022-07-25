import java.util.Scanner;

/*

Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
 */
public class DongulerDortVeBesinKuvvetler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi, temp;
        System.out.println("Sayı giriniz: ");
        sayi = scanner.nextInt();

        for (int j = 1; j <= sayi; j *= 4) {
            System.out.println("4ün kuvvetleri= " + j);
        }
        for (int j = 1; j <= sayi; j *= 5) {
            System.out.println("5in kuvvetleri= " + j);
        }

    }
}
