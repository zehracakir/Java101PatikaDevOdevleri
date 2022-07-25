/*

Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun, 
eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve unuttuğu şifre ile aynı 
olmaması gerektiğini kontrol edip , şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz." 
sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
*/

import java.util.Scanner;

public class KullaniciGirisi {
    public static void main(String[] args) {
        String userName, password, request, newPassword;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Kullanıcı adınız : ");
        userName = scanner.nextLine();

        System.out.println("Şifreniz : ");
        password = scanner.nextLine();

        if (userName.equals("Zehra") && (password.equals("java101"))) {
            System.out.println("***Giriş yaptınız***");
        } else {
            if (!(userName.equals("Zehra"))) {
                System.out.println("Kullanıcı adı hatalı!");
            }
            if (!(password.equals("java101"))) {
                System.out.println("Giriş yapılamadı şifre yanlış!");
                System.out.println("Şifrenizi sıfırlamak ister misiniz? (Evet/Hayır)");
                request = scanner.nextLine();
                if (request.equals("Evet")) {
                    System.out.println("Yeni bir şifre giriniz: ");
                    newPassword = scanner.nextLine();
                    if (newPassword.equals("java101")) {
                        System.out.println("Yeni şifreniz eksi şifrenizle aynı olamaz! Lütfen tekrar deneyiniz.");
                        while (true) {
                            System.out.println("Yeni bir şifre giriniz: ");
                            newPassword = scanner.nextLine();
                            if (!(newPassword.equals("java101"))) {
                                break;
                            }

                        }

                    }
                    System.out.println("Yeni şifre oluşturuldu.");

                } else {
                    System.out.println("Şifre değiştirmeyi seçmediniz. Giriş yapılamadı.");
                }
            }

        }

    }
}
