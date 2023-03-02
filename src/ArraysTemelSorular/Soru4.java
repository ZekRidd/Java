package ArraysTemelSorular;

import java.util.Arrays;

public class Soru4 {
    public static void main(String[] args) {
        /*
        Soru 4- Verilen bir array’de istenen bir elemanin var olup olmadigini ve varsa kac kere
        kullanildigini yazdiran bir method olusturun.
         */

        int[] arr = {1,2,3,4,2,3,4,5,1,3,4,3,3,3,3};

        elemanArama(arr,3);

    }

    public static void elemanArama(int[] arr, int aranacakEleman) {
        int flag=0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==aranacakEleman) {
                flag++;
            }
        }
        System.out.println(aranacakEleman + " Listede " + flag + " kez kullanılmıştır.");
    }
}
