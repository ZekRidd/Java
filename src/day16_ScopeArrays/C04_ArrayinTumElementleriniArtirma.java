package day16_ScopeArrays;

import java.util.Arrays;

public class C04_ArrayinTumElementleriniArtirma {
    public static void main(String[] args) {

        int[] fiyatlar = {15,25,30,35,40};

        //Tüm ürünlerin fiyatlarını 3 artırın

        for (int i = 0; i < fiyatlar.length; i++) {

            fiyatlar[i] += 3;
        }

        System.out.println(Arrays.toString(fiyatlar));
    }
}
