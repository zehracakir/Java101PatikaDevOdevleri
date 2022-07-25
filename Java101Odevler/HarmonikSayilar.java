import java.util.Scanner;

/*
 * Java ile girilen sayının harmonik serisini bulan program yazacağız.

 */
public class HarmonikSayilar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        double harmonikSeri = 0.0;

        System.out.println("n için değer giriniz: ");
        n = scanner.nextInt();

        for (double i = 1; i <= n; i++) {
            harmonikSeri += 1 / i;

        }
        System.out.println("harmonik seri: " + harmonikSeri);

    }
}
