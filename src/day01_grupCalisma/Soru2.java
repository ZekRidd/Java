package day01_grupCalisma;

public class Soru2 {
    public static void main(String[] args) {

        /* Verilen bir array'deki pozitif
        sayıları toplayıp sonucu döndüren bir metot yazınız
         */

        int[] arr = {1,2,3,4,-2,-4,-7};

        System.out.println(toplamArr(arr));
    }

    public static int toplamArr (int[] degerToplam) {

        int sum =0;

        for (int i = 0; i <degerToplam.length ; i++) {
            if(degerToplam[i]>0){
                sum+=degerToplam[i];
            }
        } return sum;

    }


}
