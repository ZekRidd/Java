package day18_multiDimensionalArrays;

import java.util.Arrays;

public class C03_MDA {
    public static void main(String[] args) {

        int[][] arr= {{1,2,3}, {4,5},{6}};
        /*
        ilk [] main arraydir, outerArray'i kontrol eder.
        ikinci [] içerdeki arrayleri kontrol eder. innerArray denir.
         */

        System.out.println(arr[1][1]); // 5 yazdırır
        System.out.println(arr[0][2]); // 3 yazdırır
        System.out.println(arr[2].length); // outerArray'in length'ini yani 1 yazdırır

       // System.out.println(arr[1]); bu şekilde yazdıramayız, toString metotunu çağırmamız gerekiyor.
        // outerArray'i direkt yazdıramayız çünkü kendisi de bir array'dir

        System.out.println(Arrays.toString(arr)); // [[I@5674cd4d, [I@63961c42, [I@65b54208]
                                                //referanslarını yazdırır, çünkü içerde de ayrı ayrı 3 tane array var.

        System.out.println(Arrays.deepToString(arr)); // [[1, 2, 3], [4, 5], [6]] içerdeki arrayleri bu şekilde yazdırabiliyoruz

        System.out.println(arr.length); // 3 yazdırır, outerArray


    }
}
