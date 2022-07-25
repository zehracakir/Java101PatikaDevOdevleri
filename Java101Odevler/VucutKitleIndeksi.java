import java.util.Scanner;

public class VucutKitleIndeksi {
    public static void main(String[] args) {
        double kilo, boy, vucutKitleIndeksi;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Kilonuzu giriniz (kg cinsinden) : ");
        kilo = scanner.nextDouble();

        System.out.println("Boyunuzu giriniz (m cinsinden) : ");
        boy = scanner.nextDouble();

        vucutKitleIndeksi = kilo / (boy * boy);

        System.out.println("Girilen değerlere göre vücut kitle indeksiniz : " + vucutKitleIndeksi);
    }
}
