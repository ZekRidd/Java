package day19_multiDimensionalArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_TekrarlardanKurtulma {
    public static void main(String[] args) {
        // verilen bir array'den tekrar eden sayıları silip
        // her bir elementin sadece 1 kez kullanıldığı hale dönüştürün

        int[] arr = {1,2,3,4,4,4,5,1,2,3,4,5,6,8,9,0};

        /*
        Bir tane boş list oluşturalım
        array'deki her bir elemanı ele alalım
        ele aldığımız elemena List'de yoksa ekleyelim
        List'de varsa eklemeyelim
         */

        List<Integer> benzersizElementList = new ArrayList<>();

        for (int i = 0; i <arr.length ; i++) {
            if(!benzersizElementList.contains(arr[i])) {
                benzersizElementList.add(arr[i]);
            }
        }

        System.out.println(benzersizElementList); // [1, 2, 3, 4, 5, 6, 8, 9, 0]

        // istenen listeyi List olarak elde ettik, bunu arr'ye direk atayamayız.
        // Atama yapmak için yeniden for döngüsünü kullanmalıyız.

        arr = new int[benzersizElementList.size()]; // [0, 0, 0, 0, 0, 0, 0, 0, 0] , bana boyutu belli olan ama değeri
                                                    // atanmamış List'i döndürür. İçerisine değerleri atamalıyız

        for (int i = 0; i <arr.length ; i++) {
            arr[i] = benzersizElementList.get(i);
        }

        System.out.println(Arrays.toString(arr)); // [1, 2, 3, 4, 5, 6, 8, 9, 0] benzersiz hale getirmiş olduk.

        }

    }

