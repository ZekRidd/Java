package day21_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C06_OrtakElementBulma {
    public static void main(String[] args) {
        /*
        Verilen iki array'in elementlerini birbiriyle karşılaştırıp
        Ortak elementleri içeren yeni liste oluşturan program yazın
         */

        Integer[] arr1= {2,3,6,7,4,7};
        Integer[] arr2= {1,3,5,7,9,3};

        List<Integer> ortakElementler = new ArrayList<>();

        for (Integer each1: arr1) {

            for (Integer each2 : arr2) {

                if(each1==each2 && !ortakElementler.contains(each1)) {
                    ortakElementler.add(each1);
                }
            }

        }
        System.out.println(ortakElementler);

    }
}
