package day18_multiDimensionalArrays;

public class C07_MDA {
    public static void main(String[] args) {
        int[][] arr = {{11,33,21,45,33},{31,23,26,77},{11,23},{28}};

        // 20 ile 40 arasında olan sayıların toplamını bulun (20 ve 40 dahil)

        int toplam =0;

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if(arr[i][j]>=20 && arr[i][j]<=40){
                    toplam+=arr[i][j];
                }
            }
        }
        System.out.println(toplam);
    }
}
