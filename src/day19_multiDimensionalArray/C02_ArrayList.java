package day19_multiDimensionalArray;

import java.util.ArrayList;
import java.util.List;

public class C02_ArrayList {
    public static void main(String[] args) {
        /*
        ArrayList, uzunluğu esnek bir listedir. Array altyapısını kullanır
        Ancak ekleme ve silme gibi işlemlerde daha avantajlıdır
         */

        List<String> harfler = new ArrayList<>(); // içi boş bir list oluşturur.
        System.out.println(harfler);

        harfler.add("s");
        harfler.add("l");
        harfler.add("a");

        System.out.println(harfler); // ekleme sırasına göre listeye dahil ediyor
    }
}
