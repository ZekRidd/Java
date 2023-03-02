package day01_grupCalisma;

import java.util.Arrays;
import java.util.Scanner;

public class Soru5 {
    public static void main(String[] args) {

        /* Soru 5- Kullanicidan array’in boyutunu ve elementlerini alip array’i olusturan ve bize
        donduren bir method olusturun */


        int[] newArray2 = createArray();
        System.out.println(Arrays.toString(newArray2));
    }

    public static int[] createArray() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen dizinin boyutunu giriniz");
        int boyut = scan.nextInt();

        int[] newArr = new int[boyut];

        for (int i = 0; i <boyut ; i++) {
            System.out.println("Lütfen " + i + " . elemanı giriniz ");
            newArr[i] = scan.nextInt();
        }
        return newArr;
    }
}
