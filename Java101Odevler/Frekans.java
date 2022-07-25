import java.util.Arrays;

/*
 * Java dilinde, dizideki elemanların kaç kez tekrar edildiğini yani frekanslarını bulan programı yazınız.

Senaryo
Dizi : [10, 20, 20, 10, 10, 20, 5, 20]
Tekrar Sayıları
10 sayısı 3 kere tekrar edildi.
20 sayısı 4 kere tekrar edildi.
5 sayısı 1 kere tekrar edildi.
 */
public class Frekans {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int[] dizi = { 10, 20, 20, 10, 10, 20, 5, 20 };
        int adet = 0;
        Arrays.sort(dizi);

        for (int i = 0; i < dizi.length; i++) {
            adet = 1;
            for (int j = 0; j < dizi.length; j++) {
                if (i != j && dizi[i] == dizi[j]) {
                    adet++;
                }
            }

            if (i == dizi.length - 1 || dizi[i] != dizi[i + 1]) {
                System.out.println(dizi[i] + " elemanı " + adet + " kez tekrar ediyor.");
            }
        }

    }
}
