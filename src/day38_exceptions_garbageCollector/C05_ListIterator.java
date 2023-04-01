package day38_exceptions_garbageCollector;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C05_ListIterator {

    /*

      Tüm elementleri index kullanmadan 3 artırın
     */

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(6);
        sayilar.add(12);
        sayilar.add(14);
        sayilar.add(5);
        sayilar.add(72);

        ListIterator lit = sayilar.listIterator();

        while(lit.hasNext()){

            Integer sayi = (Integer) lit.next();
            lit.set(sayi+3);
        }
        System.out.println(sayilar);
    }
}
