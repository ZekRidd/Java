package ArraysTemelSorular;

import java.util.Arrays;
import java.util.Scanner;

public class Soru5 {
    public static void main(String[] args) {
        /*
        Soru 5- Kullanicidan array’in boyutunu ve elementlerini alip array’i olusturan ve bize
        donduren bir method olusturun.
         */

        System.out.println("Oluşturulan dizi : " + Arrays.toString(arrayOlustur()));
    }

    public static int[] arrayOlustur(){

        Scanner scan = new Scanner(System.in);
        System.out.println("Oluşturulacak Array'in boyutunu giriniz");

        int boyut = scan.nextInt();
        int[] arr = new int[boyut];

        System.out.println("Dizinin elemanlarını giriniz");
        for (int i = 0; i <boyut ; i++) {
            System.out.print("Eleman " + (i+1) + ": ");
            arr[i]=scan.nextInt();
        } return arr;
    }
}
