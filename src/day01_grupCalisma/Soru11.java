package day01_grupCalisma;

public class Soru11 {
    public static void main(String[] args) {
        /*
        Soru 4- Verilen 2 katli bir array’de bulunan tum sayilarin carpinini bize donduren bir
        method olusturun.
         */

        int[][] arr = {{3,2,3},{5,2},{3,2,1},{2},{2,1}};

        System.out.println(multiple(arr)); // 4320

    }

    public static int multiple(int[][] arr) {
        int toplamCarpim=1;

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                toplamCarpim *=arr[i][j];
            }
        }
        return toplamCarpim;
    }
}
