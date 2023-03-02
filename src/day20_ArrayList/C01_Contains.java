package day20_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C01_Contains {
    public static void main(String[] args) {
        // uzun bir listeyi java da diziye eklemek

        int[] arr = {1,2,3,3,2,4,1,2,3,4,5,7,8,9};

        // Bu diziyi bir liste haline getirmek istersen eğer şu işlemi yapmak zorundayız ;

        List<Integer> newArr = new ArrayList<>();

        for (int i = 0; i <arr.length ; i++) {

            newArr.add(arr[i]); // int[] arr = {1,2,3,3,2,4,1,2,3,4,5,7,8,9};
        }
        System.out.println(newArr);

        // Listede element olarak 3 var mı ?

        System.out.println(newArr.contains(3)); // true döner, var mı yok mu diye cevap verir
        System.out.println(newArr.contains(9)); // false döner, olmadığını belirtir.


        newArr.clear(); // içerisinde yer alan tüm elemanları siler
        System.out.println(newArr); // [] boş liste yazdırır
    }
}
