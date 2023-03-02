package day01_grupCalisma;

public class Soru12 {
    public static void main(String[] args) {
        /*
        Soru 5- Verilen 2 katli bir array’de her bir inner array’in son elementlerinin
        toplaminini yazdiran bir method olusturun.
         */

        int[][] arr = {{3,5},{7,8,9},{3,6,4,1}}; // 15

        total(arr);
    }

    public static int total(int[][] arr) {
        int total = 0;

        for (int i = 0; i <arr.length ; i++) {
            for (int j = arr[i].length-1; j <arr[i].length ; j++) {
                total += arr[i][j];
            }
        }

        System.out.println(total);
        return total;

    }
}
