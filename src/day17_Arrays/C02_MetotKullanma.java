package day17_Arrays;

import java.util.Arrays;

public class C02_MetotKullanma {
    public static void main(String[] args) {

        // Verilen bir array'de istenen elemanın var olup olmadığını
        // ve varsa kaç kere kullanıldığını yazdıran bir metot oluşturun

        int[] arr1 = {2,3,4,6,7,1,2,3};

        elemanSayisiYazdir(arr1,3);
        elemanSayisiYazdir(arr1,1);

        String[] arr2= {"H", "K", "M", "H", "H", "E"};
        elemanSayisiYazdir(arr2,"H");

    }
    public static void elemanSayisiYazdir(int[] arr, int arananElement){

        int sayac = 0;

        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==arananElement) {
                 sayac++;
            }
        }
        System.out.println(sayac);
    }

    public static void elemanSayisiYazdir(String[] arr, String arananElement){

        int sayac = 0;

        for (int i = 0; i <arr.length ; i++) {
            if(arr[i].equals(arananElement)) {
                sayac++;
            }
        }
        System.out.println(sayac);
    }

}
