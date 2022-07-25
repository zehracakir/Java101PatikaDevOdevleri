/*
 * Şimdi sıra sende! Bir sayı dizisindeki tekrar eden çift sayıları belirten bir program yaz.

 */
public class DizidekiTekrarEdenleriBulma {
    public static void main(String[] args) {
        int[] sayi = { 10, 50, 1, 7, 10, 1, 89, 54, 20, 50, -5, 65, 20 };
        int[] tekrar = new int[sayi.length];
        int adet = 0, temp;

        for (int i = 0; i < sayi.length; i++) {

            temp = 0;
            for (int j = 0; j < sayi.length; j++) {
                if (sayi[i] == sayi[j]) {
                    temp++;
                }
            }
            if (temp != 1) {
                for (int k = 0; k < tekrar.length; k++) {
                    if (sayi[i] == tekrar[k]) {
                        adet = 1;
                    }
                }
                if (adet != 1) {

                    System.out.println(sayi[i] + " elemani " + temp + " kez tekrar etti");
                }

            }
            tekrar[i] = sayi[i];
        }
    }
}
