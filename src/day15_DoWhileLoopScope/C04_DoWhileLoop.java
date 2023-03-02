package day15_DoWhileLoopScope;

import java.util.Scanner;

public class C04_DoWhileLoop {
    // Kullanıcıdan toplanmak üzere sayılar alın
    // Kullanıcıya bitirmek için 0'a basmasını söyleyin
    // Kullanıcı 0'a bastığında
    // 0 hariç kaç sayı girdiğini ve toplamını yazdırın

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int girilenSayi = 1;
        int toplam = 0;
        int sayiAdedi = 0;


        while (girilenSayi != 0) {
            System.out.println("Toplanmak üzere tam sayı giriniz" +
                    "\nBitirmek için 0'a basınız");

            girilenSayi = scan.nextInt();

            if (girilenSayi != 0) {
                toplam += girilenSayi;
                sayiAdedi++;
            }
        }
        System.out.println("Girilen " + sayiAdedi + "adet sayının toplamı " + toplam);

    }
}



