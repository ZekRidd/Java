package day19_multiDimensionalArray;

import java.util.ArrayList;
import java.util.List;

public class C04_Remove {
    public static void main(String[] args) {

        List<String> harfler = new ArrayList<>();

        harfler.add("A");
        harfler.add("B");
        harfler.add("K");

        System.out.println(harfler); // [A, B, K]

        System.out.println(harfler.remove("B")); // true döner, silme işlemini başarıyla yaptığını ifade eder.

        System.out.println(harfler); // [A, K]

        harfler.remove(0); // Belirtilen index'teki elementi siler.
        System.out.println(harfler); // [K] sadece K kaldı.

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(18);
        sayilar.add(2);

        System.out.println(sayilar); // [1, 3, 18, 2]

        /*
        Eğer sadece sayılardan oluşan bir List varsa, remove metotuna yazacağımız sayıyı index olarak kabul eder.

        Eğer sayıyı silmek istersek, remove metotundan önce o sayiyi bir objeye atayip
        remove metotunda obje ismini yazmamız gerekir

         */

        sayilar.remove(1); // 1.index'teki 3'ü siler

        System.out.println(sayilar); // [1, 18, 2]

        // 1'i silelim

        Integer silinecekSayi = 1; // Non-primitive data türünde kullanmak zorundayız. Int yazamayız

        sayilar.remove(silinecekSayi); // Element olarak 1'i siler bu durumda, index'i değil
        System.out.println(sayilar); // [18, 2]


    }
}
