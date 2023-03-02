package day01_grupCalisma;

public class Soru8 {
    public static void main(String[] args) {
        /*
        Soru 1- Verilen 2 katli bir array’de bulunan cift sayilari toplayip, sonucu yazdiran bir
        method olusturun.
         */

        int[][] arr = {{1,2,3,4},{6,7,2,4,5}};
        result(arr);
    }

    public static void result(int[][] arr) {
        int toplam = 0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if(arr[i][j]%2==0){
                    toplam+=arr[i][j];
                }
            }
        }
        System.out.println("Dizide yer alan çift sayıların toplamı : " + toplam);
    }
}
