package day01_grupCalisma;

import java.util.Arrays;

public class Soru1 {
    public static void main(String[] args) {
        // Verilen bir int array’in tum elemanlarini 2 artirip bize donduren bir method
        //olusturun. Eski array’i yeni haliyle kaydedin.


        int[] arr = {1,2,3,4,5};
        arr=arrayArtirma(arr,2);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] arrayArtirma(int[] ilkArr, int artisMiktari) {

        for (int i = 0; i <ilkArr.length ; i++) { //İlk elementten başlayarak sonuncu elemente kadar işlem yapacak döngü

            ilkArr[i] += artisMiktari;
        }
        return ilkArr;
        
    }

}
