/*

Dizideki sayıların harmonik ortalamasını hesaplayan programı yazınız.

Harmonik Ortalama formülü : n (eleman sayısı) / elemanların harmonik serisi

 */
public class DizidekiElemanlarinOrtBulma {
    public static void main(String[] args) {
        double[] numbers = { 1, 2, 3, 4, 5 };
        double harmonicSeries = 0;
        for (int i = 0; i < numbers.length; i++) {
            harmonicSeries += 1 / numbers[i];
        }

        System.out.println("Harmonic Average Series = " + numbers.length / harmonicSeries);
    }

}
