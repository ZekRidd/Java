package ArraysTemelSorular;

import java.util.Arrays;

public class Soru3 {
    public static void main(String[] args) {
        /*
        Soru 3- Verilen bir array’deki tum elementleri bir saga kaydirip, sondaki elementi de
        basa tasiyacak bir method olusturun, array’i yeni haliyle kaydedin.
        Orn : input : [4,5,6,7] array’in son hali. : [7,4,5,6]
         */

        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(sagaKaydirma(arr)));
    }

        public static int[] sagaKaydirma(int[] arr){

        int temp = arr[arr.length-1];
            for (int i = arr.length-2; i >=0 ; i--) {
                arr[i+1]=arr[i];
            }
            arr[0]=temp;
            return arr;
        }
}
