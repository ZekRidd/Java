package day04_grupCalisma;

import java.util.Scanner;

public class UsAlma {
    public static void main(String[] args) {
        // Kullanıcıdan bir sayı alın ve istendiği kadar üssünü hesaplayın döndüren bir metot oluşturun
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen üssünü almak istediğiniz sayıyı giriniz");
        int sayi = scan.nextInt();
        System.out.println("Sayının kaçıncı üssünü almak istiyorsunuz ?");
        int us = scan.nextInt();

        System.out.println(usAlma(sayi,us));

    }
    public static int usAlma(int sayi, int us){
        int sonuc = 1;
        for (int i = 1; i <=us ; i++) {
            sonuc *=sayi;
        } return sonuc;
    }
}
