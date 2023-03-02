package day15_DoWhileLoopScope;

import java.util.Scanner;

public class C01_RakamlarToplamBulma {
    public static void main(String[] args) {

        // While loop kullanarak kullanıcıdan alınan sayının rakamlar toplamını bulma

        Scanner scan = new Scanner(System.in);
        System.out.println("Rakamları toplanacak pozitif tamsayı giriniz");
        int girilenSayi = scan.nextInt();

        int sayi = girilenSayi;
        int birlerBasamagi=0;
        int rakamlarToplam=0;

        while(sayi>0) {

            birlerBasamagi=sayi%10;
            rakamlarToplam += birlerBasamagi;

            sayi /= 10 ;
        }

        System.out.println("Girilen " + sayi + "sayısının rakamları toplamı : " + rakamlarToplam);
    }
}
