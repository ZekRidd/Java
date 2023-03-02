package day19_multiDimensionalArray;

import java.util.ArrayList;
import java.util.List;

public class C06_get_set {
    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(2);

        System.out.println(sayilar); // [3, 5, 2]

        System.out.println(sayilar.get(0)); // 3'ü getirir

        System.out.println(sayilar.get(sayilar.size() - 1)); // Son index olan 2'yi getirir

        // 2 elementini 12 yapın

        System.out.println(sayilar.set(2, 12)); // 2 getiriyor, eski elemanı

        // 5'i 7 yapalım

        System.out.println(sayilar.set(1, 7)); // 5'i getiriyor eski elemanı

        System.out.println(sayilar); // [3, 7, 12] listenin son hali böyle oluyor.

    }
}
