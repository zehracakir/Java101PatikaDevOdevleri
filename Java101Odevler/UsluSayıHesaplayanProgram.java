import java.util.Scanner;

/*
 * Ödev
Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.
*/
public class UsluSayıHesaplayanProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi, kuvvet, sonuc = 1;
        System.out.println("üssü alınacak sayıyı giriniz:");
        sayi = scanner.nextInt();
        System.out.println("kuvvet giriniz:");
        kuvvet = scanner.nextInt();

        for (int i = 1; i <= kuvvet; i++) {
            sonuc *= sayi;
        }
        System.out.println("Üslü sayının sonucu= " + sonuc);

    }
}
