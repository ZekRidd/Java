package day18_multiDimensionalArrays;

import java.util.Arrays;

public class C02_StringSplitMetotu {
    public static void main(String[] args) {

        // Split, bir stringi istediğimiz parçalara ayırmak için kullanılır

        String str = "Java Candir Can, bundan suphesi olan var mi?";

        // str kaç kelimedir ? (boşlukları sayarız + 1 ekleriz)

        String [] kelimeler = str.split(" "); // [Java, Candir, Can.] virgül ve boşlukları split metotu verir

        System.out.println(Arrays.toString(kelimeler));

        System.out.println("Kelime sayısı : " + kelimeler.length);

        // en uzun kelime kaç harflidir ?

        int enUzunKelimeLength=kelimeler[0].length();
        for (int i = 0; i <kelimeler.length ; i++) {
            if(kelimeler[i].length()>enUzunKelimeLength) {
                enUzunKelimeLength=kelimeler[i].length();
            }

        }

        System.out.println("En uzun kelimenin karakter sayısı : " + enUzunKelimeLength);

        // Bir String i karakterlerine ayırmak istersek

        String[] karakterler = str.split(""); // Hiçlik ile bölüyoruz

        System.out.println(Arrays.toString(karakterler));



    }
}
