package day37_Exceptions;

import java.util.Scanner;

public class ThrowKeyword {
    public static void main(String[] args) {
        /*

            Kodları yazarken bazı durumları kodların ignore edilmesi gerekebilir.

            Bu durumda kodları IGNORE etmek için bilerek exception fırlatabiliriz.

            Sonra da kodun çalışmasını istediğimiz yerde catch ile yakalayıp yolumuza devam ederiz.

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz");
        int yas = scanner.nextInt();

        try {
            if(yas<0){
                throw new IllegalArgumentException("Yanlış formatta giriş yapıldı");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
