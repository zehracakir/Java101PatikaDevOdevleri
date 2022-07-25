import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/*
 * Java dilinde, dizideki elemanları küçükten büyüğe sıralayan programı yazınız.
 *  Dizinin boyutunu ve dizinin elemanlarını kullanıcıdan alınız.

Senaryo
Dizinin boyutu n : 5
Dizinin elemanlarını giriniz :
1. Elemanı : 99
2. Elemanı : -2
3. Elemanı : -2121
4. Elemanı : 1
5. Elemanı : 0
Sıralama : -2121 -2 0 1 99


Dizinin boyutu n : 6
Dizinin elemanlarını giriniz :
1. Elemanı : 1000221
2. Elemanı : 22
3. Elemanı : -1
4. Elemanı : 999
5. Elemanı : 0
6. Elemanı : 254
Sıralama : -1 0 22 254 999 1000221 
 */
public class DiziSiralama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int diziBoyutu;

        System.out.println("Dizinin boyutunu giriniz: ");
        diziBoyutu = scanner.nextInt();
        int[] dizi = new int[diziBoyutu];
        System.out.println("Dizinin elemanlarini giriniz: ");

        for (int i = 0; i < diziBoyutu; i++) {
            System.out.println((i + 1) + ".elemanı giriniz: ");
            dizi[i] = scanner.nextInt();
        }
        Arrays.sort(dizi);
        System.out.println("Girilen dizinin sıralanmış hali: " + Arrays.toString(dizi));

    }
}
