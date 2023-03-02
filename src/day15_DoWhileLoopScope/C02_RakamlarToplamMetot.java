package day15_DoWhileLoopScope;

import java.util.Scanner;

public class C02_RakamlarToplamMetot {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Rakamları toplanacak sayıyı giriniz");

        int sayi = scan.nextInt();

        int toplam = 0;

        while(sayi != 0) {
            toplam += sayi %10;
            sayi /= 10;
        }

        System.out.println(toplam);

    }
}
