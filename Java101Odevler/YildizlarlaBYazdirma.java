/*
 * Ödev
Çok boyutlu diziler kullanılarak "yıldızlar" ile ekrana "B" harfi yazan programı yazınız.

 *  *  *  * 
 *        * 
 *        * 
 *  *  *  * 
 *        * 
 *        * 
 *  *  *  * 
 */
public class YildizlarlaBYazdirma {
    public static void main(String[] args) {
        String[][] harf = new String[7][4];
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == 0 || i == 3 || i == 6) {
                    harf[i][j] = "*";
                } else if (j == 0 || j == 3) {
                    harf[i][j] = "*";
                } else {
                    harf[i][j] = " ";
                }

            }
        }
        for (String[] satir : harf) {
            for (String sutun : satir) {
                System.out.print(sutun);

            }
            System.out.println("");
        }
    }
}
