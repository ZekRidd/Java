package ArraysTemelSorular;

import java.util.Arrays;

public class Soru7 {
    public static void main(String[] args) {
        /*
        Soru 7- Verilen bir array’e istenen bir elemani ekleyip bize donduren bir method yazin,
        eski array’e yeni degeri atayin.
         */

        int[] dizi = {1,2,3,4,5};
        dizi = elemanEkle(dizi,6);
        System.out.println(Arrays.toString(dizi));
    }

    public static int[] elemanEkle(int[] arr, int eklenecekSayi){

        int[] newArr = new int[arr.length+1];
        for (int i = 0; i <arr.length ; i++) {
            newArr[i]=arr[i];
        }
        newArr[newArr.length-1]=eklenecekSayi;
        return newArr;
    }
}
