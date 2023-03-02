package day01_grupCalisma;

import java.util.Arrays;

public class Soru9 {
    public static void main(String[] args) {
        /*
        Soru 2- Verilen 2 katli bir array’de ayni index’e sahip elementleri toplayip, yeni
        olusturacagimiz tek katli bir array’e bu toplamlari atayin.
        input : int[][] arr = {{3,4,5}, {2,3,6,7}};
        arr[i]=arr[j]
        output: [5, 7, 11]
         */

        int[][] arr = {{1,2,5,4},{3,7,2,4,5}}; // [4, 9, 7, 8]

        int enKisaBoyut = arr[0].length;

        for (int i = 0; i <arr.length ; i++) {
            if(arr[i].length<enKisaBoyut){
                enKisaBoyut=arr[i].length;
            }
        }

        int[] newArr = new int[enKisaBoyut];

        int toplam = 0;

        for (int i = 0; i <newArr.length ; i++) {

            for (int j =0 ; j <arr.length ; j++) {

                toplam = toplam + arr[j][i]; // arr[j][i] = arr[0][0] = 1
                                            // arr[j][i] = arr[1][0] = 3

                // arr[0][1] = 2
                // arr[1][1] = 7
            }
            newArr[i]=toplam;
            toplam=0;
        }

        System.out.println(Arrays.toString(newArr));
    }
}
