package day16_ScopeArrays;

import java.util.Arrays;

public class C03_ArrayElementleriniYazdirma {

    public static void main(String[] args) {
int[] arr = {1,3,4,6,8,11};

// Tüm array'i yazdırın

        System.out.println(Arrays.toString(arr));

        // Array'in tüm elementlerini yanyana aralarında bir boşluk bırakarak yazdırın

        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }


    }
}
