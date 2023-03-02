package day01_grupCalisma;

public class Soru4 {
    public static void main(String[] args) {
        /* Soru 4- Verilen bir array’de istenen bir elemanin var olup olmadigini ve varsa kac kere
        kullanildigini yazdiran bir method olusturun. */

        int[] arr= {1,2,4,5,6,7,8,8,9,0,1,2,3};
        isThere(arr,4);
        isThere(arr,8);
        isThere(arr,2);
    }

    public static void isThere(int[] arr, int aranacakEleman) {

        int count = 0;

        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==aranacakEleman){
                count++;
            }
        }
        System.out.println(count);
    }
}
