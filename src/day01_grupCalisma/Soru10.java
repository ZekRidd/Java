package day01_grupCalisma;

import java.util.Arrays;

public class Soru10 {
    public static void main(String[] args) {
        /*
        Soru 3- Verilen 2 katli bir array’de her bir ic array’deki elementleri toplayip, yeni
        olusturacagimiz tek katli bir array’e bu toplamlari atayin.
        input : int[][] arr = {{3,1,2,4},{1,2},{3,4,5},{10},{2,7}};
        output: [10, 3, 12, 10, 9]
         */

        int[][] arr = {{3,7,2,3},{5,2},{3,2,5},{18},{3,7}};
        int[] newArr = new int[arr.length];

        int toplam = 0;

        for (int i = 0; i <arr.length ; i++) { //outerArray'in dışına kadar döngüyü çalıştırdık
                                          // her bir index için toplam değişkenini kullandık
            for (int j = 0; j <arr[i].length ; j++) { //içerideki indexleri tek tek toplayarak toplam'a atadık
                toplam += arr[i][j];
            }   newArr[i]=toplam; // Toplam değişkenini yeni oluşturduğumuz diziye atadık
                toplam = 0;
        }

        System.out.println(Arrays.toString(newArr)); // [15, 7, 10, 18, 10]

    }
}
