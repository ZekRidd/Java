package ArraySorular;

import java.util.Arrays;

public class Soru2 {
    public static void main(String[] args) {
        /*
        Soru 2- Verilen 2 katli bir array’de ayni index’e sahip elementleri toplayip, yeni
        olusturacagimiz tek katli bir array’e bu toplamlari atayin.
        input : int[][] arr = {{3,4,5}, {2,3,6,7}};
        output: [5, 7, 11]
         */

        int[][] arr = {{3,4,5,6,9}, {2,3,6,7},{5,4,7,8,11}};

        // ilk önce oluşturacağımız array'in boyutunu bulmalıyız.
        // Bunun için outerArray'in en küçüğünü alırız.
        // arr[0]. index'i en küçük varsayarak diğerleri ile karşılaştırma yaparsak en küçük index değerine ulaşırız.


        int enKucukBoyut = arr[0].length;

        for (int i = 0; i <arr.length ; i++) {
            if(arr[i].length<arr[0].length){
                enKucukBoyut=arr[i].length;
            }
        }

        int[] newArr = new int[enKucukBoyut];

        for (int i = 0; i <arr.length ; i++) {
            int toplam =0;
            for (int j = 0; j <i ; j++) {
                newArr[i]=arr[i][j];
            }
        }

        System.out.println(Arrays.toString(newArr));

    }
}
