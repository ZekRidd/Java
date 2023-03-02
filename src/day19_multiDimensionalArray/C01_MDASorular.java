package day19_multiDimensionalArray;

import java.util.Arrays;

public class C01_MDASorular {
    public static void main(String[] args) {

        /* Soru 2- Verilen 2 katli bir array’de ayni index’e sahip elementleri toplayip, yeni
        olusturacagimiz tek katli bir array’e bu toplamlari atayin.
        input : int[][] arr = {{3,4,5}, {2,3,6,7}};
                    output: [5, 7, 11]
         */

        int[][] arr = {{1,3,4},{7,8,1,4}};

        // ortak index kullanabilmek için önce en kısa olanı bulmalıyız

        int enKisaArrayLength=arr[0].length;

        for (int i = 0; i <arr.length ; i++) {
            if(arr[i].length<enKisaArrayLength){
                enKisaArrayLength=arr[i].length;
            }
        }

        // toplamları atamak için yeni bir array oluşturalım

        int toplamlar[] = new int[enKisaArrayLength];

        int indexdekiElementlerToplam=0;

        for (int i = 0; i <enKisaArrayLength ; i++) {
            for (int j = 0; j <arr.length ; j++) {
                indexdekiElementlerToplam += arr[j][i]; // arr[j][i] = arr[0][0] = 1
                                                        // arr[j][i] = arr[1][0] = 7

                // arr[0][1] = arr[0][0] = 3
                // arr[1][1] = arr[0][0] = 8

                // arr[0][2] = arr[0][0] = 4
                // arr[1][2] = arr[0][0] = 1


            }
            toplamlar[i]=indexdekiElementlerToplam; // toplamlar[0]=8
            indexdekiElementlerToplam=0;
        }

        System.out.println(Arrays.toString(toplamlar));

    }
}
