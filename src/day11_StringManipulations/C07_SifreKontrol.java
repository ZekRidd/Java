package day11_StringManipulations;

public class C07_SifreKontrol {
    public static void main(String[] args) {

    //Soru 4 : Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin
        // ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
        // eger tum sartlari saglarsa, "sifre basariyla kaydedildi" yazdirin
        // - ilk harf kucuk harf olmali - son karakter rakam olmali - sifre bosluk icermemeli
        // - uzunlugu en az 10 karakter olmali

        int flag = 0;
        String sifre = "asad1241sad1123";
        // ilk harf küçük olmalı

        if (sifre.charAt(0)>='a' && sifre.charAt(0)<='z') {
            flag++;
        } else {
            System.out.println("İlk karakter küçük harf olmalı");
        }

        // son karakter rakam olmalı

        char sonHarf = sifre.charAt(sifre.length()-1);
        if(sonHarf>='0' && sonHarf<='9') {
            flag++;
        } else {
            System.out.println("Son karakter rakam olmalı");
        }

        //şifre boşluk içermemeli

        if (sifre.contains(" ")) {
            System.out.println("Şifre boşluk içermemeli");
        } else {
            flag++;
        }

        // uzunluğu en az 10 karakter olmalı

        if(sifre.length()>=10) {
            flag++;
        } else {
            System.out.println("Şifrenin uzunluğu en az 10 karakter olmalıdır");
        }

        if(flag==4){
            System.out.println("Şifre başarıyla kaydedildi");
        }

    }

}
