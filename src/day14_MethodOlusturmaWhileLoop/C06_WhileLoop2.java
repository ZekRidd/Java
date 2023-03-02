package day14_MethodOlusturmaWhileLoop;

import java.util.Scanner;

public class C06_WhileLoop2 {
    public static void main(String[] args) {

        // Kullanıcıdan toplanmak üzere sayılar alın
        // toplam 500'ü aşınca
        // kaç sayı girdiğini ve sayıların toplamını yazdırın

        Scanner scan = new Scanner(System.in);

        int girilenSayi=0;
        int toplam = 0;
        int girilenSayiAdeti=0;

        while(toplam<500) { // Toplam 500'den küçük olduğu süre boyunca kodu çalıştır

            System.out.println("Toplanmak üzere bir sayı giriniz");

            girilenSayi=scan.nextInt();

            toplam += girilenSayi;
            girilenSayiAdeti++;

        }

        System.out.println("Toplam " + girilenSayiAdeti + " adet sayi girildi ve toplamı : " + toplam);

    }
}
