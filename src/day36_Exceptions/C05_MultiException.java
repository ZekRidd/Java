package day36_Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C05_MultiException {
    public static void main(String[] args) {
        String str = "Java her gecen gun guzellesiyor";

        int[] arr = {2,3,4,5,1,23,4,5,6};

        // Kullanıcıdan sıfır veya pozitif bir tam sayı isteyin
        // girilen değeri index olarak kullanıp
        // str ve arr'in o indexindeki elemanlarını yazdırın

        Scanner scanner = new Scanner(System.in);

        System.out.println("Index olarak kullanmak için 0 veya pozitif bir tamsayı girin");

        /*
        Birbirinden bağımsız 3 farklı türde exception riski var.
        Bunları farklı şekillerde handle edebiliriz.

        1-Herbirini ayrı ayrı try-catch yapabiliriz.
        2- Tek bir try birden fazla catch yapılabilir.
        3 - Tek bir try-catch yapıp, tüm hataları yakalayacak bir exception türü yazılabilir


         */

        try {
            int index = scanner.nextInt(); // InputMismatchException

            System.out.println(str.charAt(index)); // StringIndexOutOfBoundsException
            System.out.println(arr[index]); // ArrayIndexOutOfBoundsException
        } catch (RuntimeException e) {
           // System.out.println("Giriş hatalı olabilir, index String veya array'in dışında olabilir");
            e.printStackTrace(); // Hatanın sebebini ve oluştuğu yeri söyler
            // Biz mesaj yazacaksak genel bir mesaj yazabiliriz
            // ya da java'nın hata kodlarını yazdırabiliriz
        }


        try {
            int index = scanner.nextInt(); // InputMismatchException

            System.out.println(str.charAt(index)); // StringIndexOutOfBoundsException
            System.out.println(arr[index]); // ArrayIndexOutOfBoundsException
        } catch (InputMismatchException e) {
            System.out.println("Tam sayı girmelisin");
        } catch (StringIndexOutOfBoundsException e){
            System.out.println("Girilen Index String sınırları dışında");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Girilen Index Array sınırları dışında");
        }
    }
}
