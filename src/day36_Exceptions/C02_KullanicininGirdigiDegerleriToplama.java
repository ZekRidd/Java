package day36_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C02_KullanicininGirdigiDegerleriToplama {

    public static void main(String[] args) {

        // Kullanıcıdan istediği kadar tam sayı alıp toplayın
        // Kullanıcı Q'ya bastığında işlemi sonlandırıp, kaç sayı girildiğini ve toplamını yazdırın
        // Q veya q dışında tam sayı olmayan bir değer girilirse hata mesajı verip
        // yeni değer isteyerek işleme devam edin


        int sayac = 0;
        int toplam = 0;
        int girilenSayi;

        Scanner scanner = new Scanner(System.in);


        do {

            try {
                System.out.println("Toplanmak üzere tamsayı giriniz \n Bitirmek için q'ya basınız");
                girilenSayi = scanner.nextInt(); //q, Q veya geçersiz başka bir input girerse geçersiz olur
                toplam+=girilenSayi;
                sayac++;
            } catch (InputMismatchException e) {

                char input = scanner.next().charAt(0);
                if(input == 'q' || input=='Q'){
                    System.out.println("Girilen " + sayac + " adet tam sayının toplamı = " + toplam);
                    break;
                } else {
                    System.out.println("Tamsayı değeri girmelisiniz");
                }
            }
        }
        while (true);
    }
}
