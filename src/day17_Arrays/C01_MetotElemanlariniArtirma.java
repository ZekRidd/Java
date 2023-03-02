package day17_Arrays;

import java.util.Arrays;

public class C01_MetotElemanlariniArtirma {
    public static void main(String[] args) {
        // Soru 1- Verilen bir array'in tüm elemanlarını 2 artırıp döndüren bir metot oluşturun
        // Eski array'i yeni haliyle kaydedin


        int[] arr = {3,4,5,6};
        arr = arrayiArtir(arr,4);

        System.out.println(Arrays.toString(arr));

    }

    public static int[] arrayiArtir(int[] ilkArr, int artis) {

        for (int i = 0; i < ilkArr.length; i++) {
            ilkArr[i] += artis;
        }

        return ilkArr;
    }
}
