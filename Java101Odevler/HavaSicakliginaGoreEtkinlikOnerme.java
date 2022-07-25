import java.util.Scanner;

/* 
 * Koşullar :

Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
Ödev
Aynı örnek üzerinden if koşulları başka hangi şekilde oluşturulabilirdi farklı çözüm yolları bulunuz.
*/
public class HavaSicakliginaGoreEtkinlikOnerme {
    public static void main(String[] args) {
        int sicaklik;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Sıcaklık değerini giriniz : ");
        sicaklik = scanner.nextInt();

        if (sicaklik < 5) {
            System.out.println("Kayak yapabilirsiniz.");
        } else if (sicaklik >= 5 && sicaklik <= 25) {
            if (sicaklik == 15) {
                System.out.println("Piknik veya sinema yapabilirsiniz.");
            } else if (sicaklik >= 5 && sicaklik < 15) {
                System.out.println("Sinemaya gidebilirsiniz.");
            } else {
                System.out.println("Pikniğe gidebilirsiniz.");
            }

        } else {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }

    }
}
