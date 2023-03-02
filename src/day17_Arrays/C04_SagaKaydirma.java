package day17_Arrays;

import java.util.Arrays;

public class C04_SagaKaydirma {
    public static void main(String[] args) {
        // Verilen integer bir array'in tüm elemanlarını sağa kaydırıp
        // soldaki elemanı ilk başa ekleyin

        int[] arr = {1,2,3,4,5,6,7,8};

        int temp = arr[arr.length-1];


        for (int i = 0; i <arr.length -1 ; i++) {

            arr[arr.length-1-i] = arr[arr.length-2-i];

        }
        arr[0]=temp;
        System.out.println(Arrays.toString(arr));
    }
}
