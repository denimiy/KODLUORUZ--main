import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 2000;
        int select;

        while (right > 0) {
            System.out.print("Kullanıcı Adınız");
            userName = input.nextLine();
            System.out.print("Şifrenizi girin");
            password = input.nextLine();
            if (userName.equals("deniz") && password.equals("deniz18.")) {
                System.out.println("merhaba; Denizbank'a hoşgeldiniz!");
                do {
                    System.out.println("lütfen yapmak istediğiniz işlemi seçiniz.");
                    System.out.println("1-para yatırma\n" +
                            "2-para çekme\n" +
                            "3-bakiye sorgulama\n" +
                            "4-çıkış yap");
                    select = input.nextInt();
                    if (select == 1) {
                        System.out.print("para miktarı: ");
                        int price = input.nextInt();
                        balance += price;
                    } else if (select == 2) {
                        System.out.print("para miktarı:");
                        int price = input.nextInt();
                        if (price > balance) {
                            System.out.println("Bakiyeniz yetersiz:");
                        } else {
                            balance -= price;
                        }
                    } else if (select == 3) {
                        System.out.print("Bakiyeniz:" + balance);
                    }
                } while (select != 4);
                System.out.println(" tekrar görüşmek üzere");
                break;
            } else {
                right--;
                System.out.println("hatalı kullanıcı adı veya şifre.tekrar deneyinin");
                if (right == 0) {
                    System.out.println("hesabınız bloke olmuştur.lütfen bankanızla iletişime geçiniz.");
                } else {
                    System.out.println("kalan hakkınız:" + right);
                }


            }
        }
    }
}