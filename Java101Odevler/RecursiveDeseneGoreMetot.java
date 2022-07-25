import java.util.Scanner;

/*
 * Java dilinde kullanıcıdan alınan n değerine göre aşağıdaki kurala uyan döngü kullanmadan bir "Recursive" metot yazın.

Kural : Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın. 
Her çıkarma işlemi sırasında ekrana son değeri yazdırın. 
Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin. 
Yine her ekleme işleminde sayının son değerini ekrana yazdırın.
 */
public class RecursiveDeseneGoreMetot {
    static void pozitif(int num1, int num2) {

        if (num1 > 0) {
            System.out.print(num1 + " ");
            num1 -= 5;
            pozitif(num1, num2);
        } else {
            negatif(num1, num2);
        }

    }

    static void negatif(int num1, int num2) {
        System.out.print(num1 + " ");
        if (num1 == num2) {
            return;
        } else {
            negatif(num1 += 5, num2);
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("N Sayısı : ");
        int num1 = scanner.nextInt();
        pozitif(num1, num1);

    }
}
