package day20_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C10_ElementlerinYeriniDegistirme {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(3);
        sayilar.add(2);
        sayilar.add(5);
        sayilar.add(7);
        sayilar.add(5);
        sayilar.add(1);
        sayilar.add(9);

        // 2. indexteki element ile 5. indexteki elementi yerini değiştirin

        System.out.println(sayilar); // [3, 2, 5, 7, 5, 1, 9]

        int temp = sayilar.get(2);

        sayilar.set(2,sayilar.get(5));
        sayilar.set(5,temp);

        System.out.println(sayilar); // [3, 2, 1, 7, 5, 5, 9]


        // odev : verilen bir listede istenen 2 indexdeki elementlerin yerini değiştirip
         //            yeni listeyi bize döndüren metot oluşturun
    }
}
