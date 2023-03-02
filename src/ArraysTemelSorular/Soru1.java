package ArraysTemelSorular;

import java.util.Arrays;

public class Soru1 {
    public static void main(String[] args) {
        /*
        Soru 1- Verilen bir int array’in tum elemanlarini 2 artirip bize donduren bir method
        olusturun. Eski array’i yeni haliyle kaydedin.
         */

        int[] array = {1,2,3,4,5,6,7,8,9};

         array =  elemanArtir(array,2);
         System.out.println(Arrays.toString(array));
    }

    public static int[] elemanArtir(int[] arr, int artisMiktari) {
        for (int i = 0; i <arr.length ; i++) {
            arr[i] += artisMiktari;
        }
        return arr;
    }

}
