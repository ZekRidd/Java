package day21_forEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_ArrayElementleriniBenzersizYapma {
    public static void main(String[] args) {
        /*
        Soru 1- Verilen bir array’de tekrar eden elementler icin, mukerrer olanlari silip, tum
        elemanlardan sadece 1 tane yapip esi array'e yeni halini atayıp yazdırın
         */


        int[] arr = {1,3,4,5,2,4,5,6,7,8,2,3,1,3};

        List<Integer> benzersizElementList = new ArrayList<>();

        // array'deki her bir elemanı kontrol edelim
        // benzersizElementlist'te yer almıyorsa ekleme yapalım

        for (int each:arr
             ) {
            if(!benzersizElementList.contains(each)){
                benzersizElementList.add(each);
            }
        }

        System.out.println(benzersizElementList); // [1, 3, 4, 5, 2, 6, 7, 8]

        // önceki array'e atama işlemini yapalım

        arr = new int[benzersizElementList.size()];
        System.out.println(Arrays.toString(arr)); // [0, 0, 0, 0, 0, 0, 0, 0]

        for (int i = 0; i <arr.length ; i++) {
            arr[i]=benzersizElementList.get(i);
        }

        System.out.println(Arrays.toString(arr)); // [1, 3, 4, 5, 2, 6, 7, 8]
    }
}
