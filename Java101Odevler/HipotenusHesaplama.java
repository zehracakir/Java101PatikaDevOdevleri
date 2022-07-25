/* 
 * Klavyeden girilen değerlere göre üçgenin hipotenüsünü hesaplayan programı yazınız.
*/
import java.util.Scanner;

public class HipotenusHesaplama {

    public static void main(String[] args) {
        double birinci, ikinci, ucuncu, cevre, alan;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Üçgenin 1. kenarını giriniz: ");
        birinci = scanner.nextDouble();

        System.out.println("Üçgenin 2. kenarını giriniz: ");
        ikinci = scanner.nextDouble();

        System.out.println("Üçgenin 3. kenarını giriniz: ");
        ucuncu = scanner.nextDouble();

        cevre = (birinci + ikinci + ucuncu) / 2;
        alan = cevre * (cevre - birinci) * (cevre - ikinci) * (cevre - ucuncu);

        System.out.println("Girilen değerler göre üçgenin alanı : " + alan);

    }
}
