package day19_multiDimensionalArray;

import java.util.ArrayList;
import java.util.List;

public class C03_add {
    public static void main(String[] args) {

        /*
        List data türü olarak primitive kabul etmez.

         */
        List<Integer> sayilar = new ArrayList<>(); // Integer class'ını kullanarak liste integer'ı dahil edebiliyoruz

        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(2);

        System.out.println(sayilar); // [3, 5, 2]

        // 3 ile 5 arasına 7'yi ekleyin

        sayilar.add(1,7); // Belirtilen index'e istenilen elementi ekliyoruz
        System.out.println(sayilar);

        List<Integer> ekler = new ArrayList<>();

        ekler.add(4);
        ekler.add(6);

        System.out.println(ekler); // [4, 6]

        sayilar.addAll(ekler);
        System.out.println(sayilar); // Başka bir listenin bütün elemanlarını ekleyebiliyoruz

        // Aynı şekilde istenilen index'e başka bir listeyi de index'ini belirterek ekleyebiliriz.

        sayilar.addAll(2,ekler); //2.index'e ekler listesini ekledik.
        System.out.println(sayilar);
    }
}
