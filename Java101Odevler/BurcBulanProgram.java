
/*
 * Koç Burcu : 21 Mart - 20 Nisan

Boğa Burcu : 21 Nisan - 21 Mayıs

İkizler Burcu : 22 Mayıs - 22 Haziran

Yengeç Burcu : 23 Haziran - 22 Temmuz

Aslan Burcu : 23 Temmuz - 22 Ağustos

Başak Burcu : 23 Ağustos - 22 Eylül

Terazi Burcu : 23 Eylül - 22 Ekim

Akrep Burcu : 23 Ekim - 21 Kasım

Yay Burcu : 22 Kasım - 21 Aralık

Oğlak Burcu : 22 Aralık - 21 Ocak

Kova Burcu : 22 Ocak - 19 Şubat

Balık Burcu : 20 Şubat - 20 Mart

Burçları switch-case kullanmadan bulunuz.
 */
import java.util.Scanner;

public class BurcBulanProgram {
    public static void main(String[] args) {
        String ay;
        int gun;

        Scanner scanner = new Scanner(System.in);

        System.out.println(
                "Doğum ayınızı giriniz:\nOcak\nŞubat\nMart\nNisan\nMayıs\nHaziran\nTemmuz\nAğustos\nEylül\nEkim\nKasım\nAralık");
        ay = scanner.nextLine();

        System.out.println("Doğum gününüzü giriniz (1-31");
        gun = scanner.nextInt();

        if (gun >= 1 && gun <= 31) {

            if (ay.equals("Ocak")) {
                if (gun <= 21) {
                    System.out.println("Oğlak burcusunuz");
                } else {
                    System.out.println("Kova burcusunuz");
                }
            }

            else if (ay.equals("Şubat")) {
                if (gun <= 19) {
                    System.out.println("Kova burcusunuz");
                } else {
                    System.out.println("Balık burcusunuz");
                }
            }

            else if (ay.equals("Mart")) {
                if (gun <= 20) {
                    System.out.println("Balık burcusunuz");
                } else {
                    System.out.println("Koç burcusunuz");
                }
            }

            else if (ay.equals("Nisan")) {
                if (gun <= 20) {
                    System.out.println("Koç burcusunuz");
                } else {
                    System.out.println("Boğa burcusunuz");
                }
            }

            else if (ay.equals("Mayıs")) {
                if (gun <= 21) {
                    System.out.println("Boğa burcusunuz");
                } else {
                    System.out.println("İkizler burcusunuz");
                }
            }

            else if (ay.equals("Haziran")) {
                if (gun <= 22) {
                    System.out.println("İkizler burcusunuz");
                } else {
                    System.out.println("Yengeç burcusunuz");
                }
            }

            else if (ay.equals("Temmuz")) {
                if (gun <= 22) {
                    System.out.println("Yengeç burcusunuz");
                } else {
                    System.out.println("Aslan burcusunuz");
                }
            }

            else if (ay.equals("Ağustos")) {
                if (gun <= 22) {
                    System.out.println("Aslan burcusunuz");
                } else {
                    System.out.println("Başak burcusunuz");
                }
            }

            else if (ay.equals("Eylül")) {
                if (gun <= 22) {
                    System.out.println("Başak burcusunuz");
                } else {
                    System.out.println("Terazi burcusunuz");
                }
            }

            else if (ay.equals("Ekim")) {
                if (gun <= 22) {
                    System.out.println("Terazi burcusunuz");
                } else {
                    System.out.println("Akrep burcusunuz");
                }
            }

            else if (ay.equals("Akrep")) {
                if (gun <= 21) {
                    System.out.println("Akrep burcusunuz");
                } else {
                    System.out.println("Yay burcusunuz");
                }
            }

            else if (ay.equals("Aralık")) {
                if (gun <= 21) {
                    System.out.println("Yay burcusunuz");
                } else {
                    System.out.println("Oğlak burcusunuz");
                }
            } else {
                System.out.println("Hatalı ay girişi");
            }

        } else {
            System.out.println("Günü yanlış girdiniz:");
        }

    }

}
