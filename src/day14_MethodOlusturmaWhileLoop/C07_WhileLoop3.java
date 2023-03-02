package day14_MethodOlusturmaWhileLoop;

import java.util.Scanner;

public class C07_WhileLoop3 {
    public static void main(String[] args) {
        // Kullanıcıdan bir şifre isteyin
        // Aşağıdaki şartları sağlayana kadar
        // her seferinde hataları söyleyip yeni şifre isteyin
        // şartları sağlayana kadar
        // "5. denemenizde şifre oluşturuldu" şeklinde açıklama yazın

        // 1- ilk harf küçük harf olmalı
        // 2- son harf büyük harf olmalı
        // 3- boşluk içermemeli
        // 4- 8 karakter veya daha uzun olmalı

        Scanner scan = new Scanner(System.in);

        String sifre = "";
        int flag = 0;
        int denemeSayisi = 0;

        while(flag != 4) {
            flag=0;
            System.out.println("Lütfen bir şifre giriniz");
            sifre=scan.nextLine();

            // ilk harf küçük olmalı

            if(sifre.charAt(0)>='a' && sifre.charAt(0)<='z') {
                flag++;
            } else {
                System.out.println("İlk karakter küçük harf olmalı");
            }

            // son harf büyük harf olmalı

            if(sifre.charAt(sifre.length()-1)>='A' && sifre.charAt(sifre.length()-1)<='Z') {
                flag++;
            } else {
                System.out.println("Son karakter büyük harf olmalı");
            }

            // Boşluk içermemeli

            if(sifre.contains(" ")){
                System.out.println("Şifre boşluk içermemeli");
            } else {
                flag++;
            }

            // 8 Karakter veya daha uzun olmalı

            if (sifre.length()>=8) {
                flag++;
            } else {
                System.out.println("Şifre minumum 8 karakter olmalı");
            }

            denemeSayisi++;
        }

        System.out.println("Tebrikler! " + denemeSayisi + ". denemede şifreniz başarı ile kaydedildi");

    }
}
