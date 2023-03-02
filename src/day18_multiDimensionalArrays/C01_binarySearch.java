package day18_multiDimensionalArrays;

import java.util.Arrays;

public class C01_binarySearch {

    public static void main(String[] args) {

        // verilen bir array'de istenen elemanın olup olmadığını bulun


        int[] arr = {1,2,3,4,5,6,6,7,2,3,4,5};

        System.out.println(Arrays.binarySearch(arr,5)); // binarySearch, binary ağacını kullanarak arama yapar
                                                            // doğru sonucu istiyorsak, dizinin sort ile
                                                            // doğal sıralanmış olması gerekmektedir.

        Arrays.sort(arr); // [1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7]
        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.binarySearch(arr,3)); // Eğer birden fazla varsa, ilkini işleme alır
        System.out.println(Arrays.binarySearch(arr, 11));

        /* Olmayan bir element arandığında ilk olarak o eleman dizide olsaydı
        nerede olurdu, bunu buluyoruz, sonra olmadığı için başına - eksi işareti koyuyoruz
         */
    }
}
