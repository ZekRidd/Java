package day17_Arrays;

import java.util.Arrays;

public class C05_ArrayaElemanEkleme {
    public static void main(String[] args) {

        // Verilen bir array'e eleman ekleme

        int[] a={1,2,3,4};
        int[] b={5,6,7,8};

        /* Array'in uzunluğu değiştirilemez.
        Ancak yeni bir array değeri atayabiliriz. Bu durumda yeni array'in uzunluğu geçerli olur.
         */

        a=b;

        System.out.println(Arrays.toString(a));

        // arr = new int[4]; // [0,0,0,0] olur , direk atama yaparsak eski değerler kaybolur
        // önce istenen uzunlukta yeni bir array oluşturup
        // eski array'deki tüm elementleri yeni array'e taşıyoruz
        // sonra istenen elementi de atayıp
        // yeni istediğimiz hale gelince
        // eski Arr= yeni Arr diyerek yeni array'in değerini eski array'e atıyoruz.

        int[] arr = {4,5,6};
        int eklenecekElement = 7;

        int[] yeniArr = new int[arr.length+1]; //  

        for (int i = 0; i < arr.length; i++) {

            yeniArr[i] = arr[i];
        } // yeniArr = [4,5,6,0] olacaktır

        yeniArr[yeniArr.length-1] = eklenecekElement;
        System.out.println(Arrays.toString(yeniArr));
    }
}
