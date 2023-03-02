package day18_multiDimensionalArrays;

public class C06_MDA {
    public static void main(String[] args) {
        int[][] arr = {{3,5,7},{1,2,3,4},{1,2},{7}};

        // Array'de kaç tane çift sayı olduğunu bulun

        int ciftSayi=0;

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if(arr[i][j]%2==0) {
                    ciftSayi++;
                }

            }

        }
        System.out.println(ciftSayi);
    }
}
