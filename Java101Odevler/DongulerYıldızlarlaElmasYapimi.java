/*


Java'da döngüler kullanarak yıldızlar ile elmas yapınız.
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
 */
public class DongulerYıldızlarlaElmasYapimi {
    public static void main(String[] args) {

        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= 4 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");

            }

            System.out.println(" ");

        }
        for (int i = 4; i > 0; i--) {
            for (int j = -1; j <= 4 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k < 2 * i; k++) {
                System.out.print("*");

            }

            System.out.println(" ");
        }
    }
}
