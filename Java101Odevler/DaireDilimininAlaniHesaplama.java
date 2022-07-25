/*
 * Klavyeden girilen değerlere göre daire diliminin alanını hesaplayan program yazınız.
 * 
 */
import java.util.Scanner;

public class DaireDilimininAlaniHesaplama {
   public static void main(String[] args) {
      double yaricap, merkezAci, alan;
      final double pi = 3.14;

      Scanner scanner = new Scanner(System.in);
      System.out.println("Daire diliminin yarıçap değerini giriniz: ");
      yaricap = scanner.nextDouble();

      System.out.println("Daire diliminin merkaz açısının ölçüsünü giriniz: ");
      merkezAci = scanner.nextDouble();

      alan = (pi * (yaricap * yaricap) * merkezAci) / 360;

      System.out.println("Girilen değerlere göre daire diliminin alanı: " + alan);
   }
}
