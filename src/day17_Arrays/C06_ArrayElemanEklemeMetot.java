package day17_Arrays;

import java.util.Arrays;

public class C06_ArrayElemanEklemeMetot {
    public static void main(String[] args) {
        // Verilen bir array'e istenen bir elementi ekleyip, yeni halini bize döndüren
        // bir metot oluşturun

        int[] arr = {2,4,7,8};

        // arr'ye metot kullanarak 5 ekleyin

        arr=arrayeElementEkle(arr,5);
        arr=arrayeElementEkle(arr,9);
        arr=arrayeElementEkle(arr,11);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] arrayeElementEkle(int[] arr, int eklenecekElement) {
         int[] yeniArr = new int[arr.length+1]; // [0,0,0,0]

        for (int i = 0; i <arr.length ; i++) {
            yeniArr[i]=arr[i];
        } // yeniArr = [2,4,7,8,0] olacak

        yeniArr[yeniArr.length-1] = eklenecekElement;
        return yeniArr;
    }
}

