import java.util.Scanner;

/*
 * Java ile basamak sayısının kullanıcıdan alınan ve döngüler kullanılarak, yıldızlar(*) ile ekrana ters üçgen çizen programı yazın.

Örnek
Basamak Sayısı : 10

 *******************
  *****************
   ***************
    *************
     ***********
      *********
       *******
        *****
         ***
          *
 */
public class YildizlarlaTersUcgen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int basamakSayi;

        System.out.println("Kaç basamaklı üçgen yapacaksınız?");
        basamakSayi = scanner.nextInt();

        for (int i = basamakSayi; i > 0; i--) {
            for (int j = -1; j <= basamakSayi - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k < 2 * i; k++) {
                System.out.print("*");

            }

            System.out.println(" ");

        }
    }
}
