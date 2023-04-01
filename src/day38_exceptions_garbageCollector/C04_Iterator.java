package day38_exceptions_garbageCollector;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C04_Iterator {
    public static void main(String[] args) {
        /*
            Java'da Collection yapısında göreceğimiz set gibi bazı yapılar index desteklemez

            Bu durumda index olmadığından elementleri yazdırmak istersek for each loop kullanabiliriz.
            Ama elementler arasında dolaşmak belirli şartları sağlayanları update etmek istersek for each loop ile yapamayız

            List'te istenmeyen elementleri silmek istediğimizde
            her sildiğimiz element uzunluğu değiştirdiği için kodlar sağlıklı çalışmaz

            Bu sorunları çözmek için Iterator interface'ine ihtiyacımız var

         */

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(6);
        sayilar.add(12);
        sayilar.add(14);
        sayilar.add(5);
        sayilar.add(72);

        // Çift olan sayilari silin

        Iterator it1 = sayilar.iterator();

        while(it1.hasNext()){

            Integer sayi = (Integer) it1.next();

            if(sayi%2==0){
                it1.remove();
            }
        }

        System.out.println(sayilar);
    }
}
