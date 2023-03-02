package ArraysTemelSorular;

public class Soru2 {
    public static void main(String[] args) {
        /*
        Soru 2- Verilen bir array’deki pozitif tamsayilari toplayip sonucu bize donduren bir
        method yaziniz.
         */

        int[] array = {1,2,3,4,5,6,7,8,9};
        System.out.println(toplam(array));
    }

    public static int toplam(int[] arr) {
        int toplam = 0;
        for (int i = 0; i <arr.length ; i++) {
            toplam+=arr[i];
        } return toplam;
    }
}
