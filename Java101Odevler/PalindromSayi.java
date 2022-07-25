/*
 * Java ile bir sayının "Palindrom Sayı" olup olmadığını bulan bir program yapıyoruz.

Palindrom Sayı Nedir ?
Palindromik sayı, iki taraftan okunduğu zaman okunuş yönüyle aynı olan sayılardır.

Örnek: 1, 4, 8, 99, 101, 363, 4004, 9889....
 */
public class PalindromSayi {
    static boolean isPalindrom(int number) {
        int temp = number, reverseNumber = 0, lastNumber;
        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }
        System.out.println("Reverse number= " + reverseNumber);

        if (number == reverseNumber) {
            System.out.println("Girilen sayı palindrom sayıdır.");
        } else {
            System.out.println("Girilen sayı palindrom değildir!!!");
        }
        return true;
    }

    public static void main(String[] args) {
        isPalindrom(808);
    }
}
