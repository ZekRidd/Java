package day17_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C07_KullanicidanDegerAlarakArrayOlustur {
    public static void main(String[] args) {
        //Kullanıcıdan array oluşturmak üzere pozitif tam sayılar alın
        // Kullanıcıya işlemi bitirmesi için 0'a basması gerektiğini söyleyin
        // Bir önceki class'dan metot kullanarak aldığınız elementleri array'e ekleyin

        Scanner scan = new Scanner(System.in);
        int girilenSayi = 1;

        int[] arr = new int[0]; //

        while(girilenSayi !=0) {
            System.out.println("Array'e eklemek için pozitif sayılar girin" +
                    "\nişlemi bitirmek için 0'a basın");
            girilenSayi=scan.nextInt();

            if(girilenSayi !=0){
                arr=C06_ArrayElemanEklemeMetot.arrayeElementEkle(arr,girilenSayi);
            }
        }

        System.out.println(Arrays.toString(arr));

    }
}
