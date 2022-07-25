import java.util.Scanner;

public class RecursiveFibonacciSerisi {
    static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.println("Fibonacci dizisinin kaçıncı adımını bulmak istersiniz?");
        n = scanner.nextInt();
        System.out.println(n + ".adım= " + fibonacci(n));
    }
}
