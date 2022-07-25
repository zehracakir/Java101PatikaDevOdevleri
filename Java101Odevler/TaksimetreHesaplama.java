import java.util.Scanner;

public class TaksimetreHesaplama {
    public static void main(String[] args) {
        double km, odenecekTutar;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Gidilen km yi giriniz: ");
        km = scanner.nextDouble();

        odenecekTutar = km * 2.20 + 10;
        System.out.print("Ödenecek tutar : ");
        System.out.println((odenecekTutar < 20) ? 20 : odenecekTutar);

    }

}
