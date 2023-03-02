package day18_multiDimensionalArrays;

public class C05_MDA {
    public static void main(String[] args) {

        int[][] arr = {{3,5,7},{1,2,3,4},{1,2},{7}};

        // Toplam eleman sayısı kaçtır ?

        int elementSayisi = 0;

        for (int i = 0; i <arr.length ; i++) {
            elementSayisi+=arr[i].length;

        }
        System.out.println("Toplam element sayısı : " + elementSayisi);

        // Tüm elementlerin toplamını bulun.

        // MDA'lerde her bir elementi elden geçirmek istiyorsak
        // kat sayısı kadar nested for-loop kullanırız

        int elementlerToplami=0;

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {

               // ekrana tüm elementleri yazdırmak için System.out.println(arr[i][j]);

                elementlerToplami+=arr[i][j];

            }
            
        }
        System.out.println("Elementlerin toplamı : " + elementlerToplami);
    }
}
