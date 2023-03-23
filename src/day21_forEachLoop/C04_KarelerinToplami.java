package day21_forEachLoop;

public class C04_KarelerinToplami {
    public static void main(String[] args) {
        // Verilen integer bir array'deki her elementin karelerini alıp
        // karelerin toplamını yazdıran bir method oluşturun


        int[] array={1,2,3,4,5,6,7,8,9};
        System.out.println(karelerinToplami(array));
    }

    public static int karelerinToplami(int[] arr){
        int toplam = 0;
        for (int each:arr
             ) {
            toplam+=each*each;
        }
        System.out.println("Karelerin toplamı : " + toplam);
        return toplam;
    }
}
