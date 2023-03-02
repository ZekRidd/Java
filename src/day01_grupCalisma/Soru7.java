package day01_grupCalisma;

import java.util.Arrays;

public class Soru7 {
    public static void main(String[] args) {
        /* Soru 7- Verilen bir array’e istenen bir elemani ekleyip bize donduren bir method yazin,
        eski array’e yeni degeri atayin.
         */

        int[] arr = {1,2,3,4,8};

        arr=addElement(arr,9);

        System.out.println(Arrays.toString(arr)); // [1, 2, 3, 4, 8, 9]
    }

    public static int[] addElement(int[] arr, int element){

        int[] newArr = new int[arr.length+1];

        for (int i = 0; i <arr.length ; i++) {
            newArr[i]=arr[i];
        }
        newArr[newArr.length-1] = element;

        return  newArr;
    }
}
